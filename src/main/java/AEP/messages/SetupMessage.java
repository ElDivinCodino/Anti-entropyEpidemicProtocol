package AEP.messages;

import AEP.PreciseParticipant;
import AEP.PreciseParticipant.Ordering;
import akka.actor.ActorRef;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Francesco on 24/08/17.
 */
public class SetupMessage implements Serializable {

    private int tuplesNumber;
    private List<ActorRef> ps;
    private int mtu;
    private String storagePath;
    private List<Integer> timesteps;
    private List<Integer> updaterates;
    private float alpha;
    private float beta;
    private Ordering ordering;


    public SetupMessage(int tuplesNumber, List participants) {
        this.tuplesNumber = tuplesNumber;
        ps = participants;
    }

    public SetupMessage(int tuplesNumber, List<ActorRef> ps, int mtu, String storagePath, List<Integer> timesteps, List<Integer> updaterates, float alpha, float beta, Ordering ordering) {
        this.tuplesNumber = tuplesNumber;
        this.ps = ps;
        this.mtu = mtu;
        this.storagePath = storagePath;
        this.timesteps = timesteps;
        this.updaterates = updaterates;
        this.alpha = alpha;
        this.beta = beta;
        this.ordering = ordering;
    }

    public int getTuplesNumber() {
        return tuplesNumber;
    }

    public List<ActorRef> getPs() {
        return ps;
    }

    public int getMtu() {
        return mtu;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public List<Integer> getTimesteps() {
        return timesteps;
    }

    public List<Integer> getUpdaterates() {
        return updaterates;
    }

    public float getAlpha() {
        return alpha;
    }

    public float getBeta() {
        return beta;
    }

    public Ordering getOrdering() {
        return ordering;
    }
}
