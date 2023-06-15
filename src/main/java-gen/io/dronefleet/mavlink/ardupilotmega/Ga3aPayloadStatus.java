package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Status of Payload related activities handled by RPi 
 */
@MavlinkMessageInfo(
        id = 5000,
        crc = 255,
        description = "Status of Payload related activities handled by RPi"
)
public final class Ga3aPayloadStatus {
    private final int targetSystem;

    private final int targetComponent;

    private final float remainPayload;

    private final int resumeButtonEnable;

    private Ga3aPayloadStatus(int targetSystem, int targetComponent, float remainPayload,
            int resumeButtonEnable) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.remainPayload = remainPayload;
        this.resumeButtonEnable = resumeButtonEnable;
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
     * Remaining Payload 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            description = "Remaining Payload"
    )
    public final float remainPayload() {
        return this.remainPayload;
    }

    /**
     * Resume button should be enable 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "Resume button should be enable"
    )
    public final int resumeButtonEnable() {
        return this.resumeButtonEnable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        Ga3aPayloadStatus other = (Ga3aPayloadStatus)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(remainPayload, other.remainPayload)) return false;
        if (!Objects.deepEquals(resumeButtonEnable, other.resumeButtonEnable)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(remainPayload);
        result = 31 * result + Objects.hashCode(resumeButtonEnable);
        return result;
    }

    @Override
    public String toString() {
        return "Ga3aPayloadStatus{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", remainPayload=" + remainPayload
                 + ", resumeButtonEnable=" + resumeButtonEnable + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private float remainPayload;

        private int resumeButtonEnable;

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
         * Remaining Payload 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                description = "Remaining Payload"
        )
        public final Builder remainPayload(float remainPayload) {
            this.remainPayload = remainPayload;
            return this;
        }

        /**
         * Resume button should be enable 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "Resume button should be enable"
        )
        public final Builder resumeButtonEnable(int resumeButtonEnable) {
            this.resumeButtonEnable = resumeButtonEnable;
            return this;
        }

        public final Ga3aPayloadStatus build() {
            return new Ga3aPayloadStatus(targetSystem, targetComponent, remainPayload, resumeButtonEnable);
        }
    }
}
