package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * NPNT Status from Companion Computer to ArduPilot 
 */
@MavlinkMessageInfo(
        id = 6000,
        crc = 39,
        description = "NPNT Status from Companion Computer to ArduPilot"
)
public final class NpntStatus {
    private final int targetSystem;

    private final int targetComponent;

    private final int armingAllowed;

    private final String reason;

    private NpntStatus(int targetSystem, int targetComponent, int armingAllowed, String reason) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.armingAllowed = armingAllowed;
        this.reason = reason;
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
     * Arming is Allowed or not 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "Arming is Allowed or not"
    )
    public final int armingAllowed() {
        return this.armingAllowed;
    }

    /**
     * What is reason if arming is not allowed 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            arraySize = 40,
            description = "What is reason if arming is not allowed"
    )
    public final String reason() {
        return this.reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntStatus other = (NpntStatus)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(armingAllowed, other.armingAllowed)) return false;
        if (!Objects.deepEquals(reason, other.reason)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(armingAllowed);
        result = 31 * result + Objects.hashCode(reason);
        return result;
    }

    @Override
    public String toString() {
        return "NpntStatus{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", armingAllowed=" + armingAllowed
                 + ", reason=" + reason + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int armingAllowed;

        private String reason;

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
         * Arming is Allowed or not 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "Arming is Allowed or not"
        )
        public final Builder armingAllowed(int armingAllowed) {
            this.armingAllowed = armingAllowed;
            return this;
        }

        /**
         * What is reason if arming is not allowed 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                arraySize = 40,
                description = "What is reason if arming is not allowed"
        )
        public final Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public final NpntStatus build() {
            return new NpntStatus(targetSystem, targetComponent, armingAllowed, reason);
        }
    }
}
