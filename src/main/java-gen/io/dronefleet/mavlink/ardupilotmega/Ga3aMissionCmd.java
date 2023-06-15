package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Description of spraying mission related parameters 
 */
@MavlinkMessageInfo(
        id = 5001,
        crc = 222,
        description = "Description of spraying mission related parameters"
)
public final class Ga3aMissionCmd {
    private final int targetSystem;

    private final int targetComponent;

    private final int startWp;

    private final int endWp;

    private final int missionAlt;

    private final int missionYaw;

    private Ga3aMissionCmd(int targetSystem, int targetComponent, int startWp, int endWp,
            int missionAlt, int missionYaw) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.startWp = startWp;
        this.endWp = endWp;
        this.missionAlt = missionAlt;
        this.missionYaw = missionYaw;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            description = "System ID"
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "Component ID"
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * Waypoint from where spraying should start 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            description = "Waypoint from where spraying should start"
    )
    public final int startWp() {
        return this.startWp;
    }

    /**
     * Waypoint at which spraying should stop 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            description = "Waypoint at which spraying should stop"
    )
    public final int endWp() {
        return this.endWp;
    }

    /**
     * Altitude of the mission 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            description = "Altitude of the mission"
    )
    public final int missionAlt() {
        return this.missionAlt;
    }

    /**
     * Angle of mission respect to North 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 2,
            description = "Angle of mission respect to North"
    )
    public final int missionYaw() {
        return this.missionYaw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        Ga3aMissionCmd other = (Ga3aMissionCmd)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(startWp, other.startWp)) return false;
        if (!Objects.deepEquals(endWp, other.endWp)) return false;
        if (!Objects.deepEquals(missionAlt, other.missionAlt)) return false;
        if (!Objects.deepEquals(missionYaw, other.missionYaw)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(startWp);
        result = 31 * result + Objects.hashCode(endWp);
        result = 31 * result + Objects.hashCode(missionAlt);
        result = 31 * result + Objects.hashCode(missionYaw);
        return result;
    }

    @Override
    public String toString() {
        return "Ga3aMissionCmd{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", startWp=" + startWp
                 + ", endWp=" + endWp
                 + ", missionAlt=" + missionAlt
                 + ", missionYaw=" + missionYaw + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int startWp;

        private int endWp;

        private int missionAlt;

        private int missionYaw;

        /**
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                description = "System ID"
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "Component ID"
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * Waypoint from where spraying should start 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                description = "Waypoint from where spraying should start"
        )
        public final Builder startWp(int startWp) {
            this.startWp = startWp;
            return this;
        }

        /**
         * Waypoint at which spraying should stop 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                description = "Waypoint at which spraying should stop"
        )
        public final Builder endWp(int endWp) {
            this.endWp = endWp;
            return this;
        }

        /**
         * Altitude of the mission 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                description = "Altitude of the mission"
        )
        public final Builder missionAlt(int missionAlt) {
            this.missionAlt = missionAlt;
            return this;
        }

        /**
         * Angle of mission respect to North 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 2,
                description = "Angle of mission respect to North"
        )
        public final Builder missionYaw(int missionYaw) {
            this.missionYaw = missionYaw;
            return this;
        }

        public final Ga3aMissionCmd build() {
            return new Ga3aMissionCmd(targetSystem, targetComponent, startWp, endWp, missionAlt, missionYaw);
        }
    }
}
