package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Command to resume mission from GCS to RPi 
 */
@MavlinkMessageInfo(
        id = 5002,
        crc = 60,
        description = "Command to resume mission from GCS to RPi"
)
public final class Ga3aResumeCmd {
    private final int targetSystem;

    private final int targetComponent;

    private final int doResume;

    private Ga3aResumeCmd(int targetSystem, int targetComponent, int doResume) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.doResume = doResume;
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
     * Do Resume 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "Do Resume"
    )
    public final int doResume() {
        return this.doResume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        Ga3aResumeCmd other = (Ga3aResumeCmd)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(doResume, other.doResume)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(doResume);
        return result;
    }

    @Override
    public String toString() {
        return "Ga3aResumeCmd{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", doResume=" + doResume + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int doResume;

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
         * Do Resume 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "Do Resume"
        )
        public final Builder doResume(int doResume) {
            this.doResume = doResume;
            return this;
        }

        public final Ga3aResumeCmd build() {
            return new Ga3aResumeCmd(targetSystem, targetComponent, doResume);
        }
    }
}
