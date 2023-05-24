package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Spray waypoint, start-stop pair send from GCS to Companion Computer 
 */
@MavlinkMessageInfo(
        id = 6008,
        crc = 141,
        description = "Spray waypoint, start-stop pair send from GCS to Companion Computer"
)
public final class Ga3aSprayWpIndex {
    private final int targetSystem;

    private final int targetComponent;

    private final int sequence;

    private final int startWp;

    private final int endWp;

    private Ga3aSprayWpIndex(int targetSystem, int targetComponent, int sequence, int startWp,
            int endWp) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.sequence = sequence;
        this.startWp = startWp;
        this.endWp = endWp;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * System ID (0 for broadcast) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            description = "System ID (0 for broadcast)"
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID (0 for broadcast) 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "Component ID (0 for broadcast)"
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * sequence of start-stop waypoint pair send by GCS, Companion computer acknowledges by sending 
     * back (sequence+1) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            description = "sequence of start-stop waypoint pair send by GCS,\n"
                            + "        Companion computer acknowledges by sending back (sequence+1)"
    )
    public final int sequence() {
        return this.sequence;
    }

    /**
     * waypoint at which spray starts 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            description = "waypoint at which spray starts"
    )
    public final int startWp() {
        return this.startWp;
    }

    /**
     * waypoint at which spray ends 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            description = "waypoint at which spray ends"
    )
    public final int endWp() {
        return this.endWp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        Ga3aSprayWpIndex other = (Ga3aSprayWpIndex)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(sequence, other.sequence)) return false;
        if (!Objects.deepEquals(startWp, other.startWp)) return false;
        if (!Objects.deepEquals(endWp, other.endWp)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(sequence);
        result = 31 * result + Objects.hashCode(startWp);
        result = 31 * result + Objects.hashCode(endWp);
        return result;
    }

    @Override
    public String toString() {
        return "Ga3aSprayWpIndex{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", sequence=" + sequence
                 + ", startWp=" + startWp
                 + ", endWp=" + endWp + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int sequence;

        private int startWp;

        private int endWp;

        /**
         * System ID (0 for broadcast) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                description = "System ID (0 for broadcast)"
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID (0 for broadcast) 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "Component ID (0 for broadcast)"
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * sequence of start-stop waypoint pair send by GCS, Companion computer acknowledges by sending 
         * back (sequence+1) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                description = "sequence of start-stop waypoint pair send by GCS,\n"
                                + "        Companion computer acknowledges by sending back (sequence+1)"
        )
        public final Builder sequence(int sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * waypoint at which spray starts 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                description = "waypoint at which spray starts"
        )
        public final Builder startWp(int startWp) {
            this.startWp = startWp;
            return this;
        }

        /**
         * waypoint at which spray ends 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                description = "waypoint at which spray ends"
        )
        public final Builder endWp(int endWp) {
            this.endWp = endWp;
            return this;
        }

        public final Ga3aSprayWpIndex build() {
            return new Ga3aSprayWpIndex(targetSystem, targetComponent, sequence, startWp, endWp);
        }
    }
}
