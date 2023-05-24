package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Status text message from Comp. Computer to GCS 
 */
@MavlinkMessageInfo(
        id = 6010,
        crc = 52,
        description = "Status text message from Comp. Computer to GCS"
)
public final class GaCcStatusText {
    private final int targetSystem;

    private final int targetComponent;

    private final String statusText;

    private GaCcStatusText(int targetSystem, int targetComponent, String statusText) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.statusText = statusText;
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
     * status text message 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 250,
            description = "status text message"
    )
    public final String statusText() {
        return this.statusText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GaCcStatusText other = (GaCcStatusText)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(statusText, other.statusText)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(statusText);
        return result;
    }

    @Override
    public String toString() {
        return "GaCcStatusText{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", statusText=" + statusText + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private String statusText;

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
         * status text message 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 250,
                description = "status text message"
        )
        public final Builder statusText(String statusText) {
            this.statusText = statusText;
            return this;
        }

        public final GaCcStatusText build() {
            return new GaCcStatusText(targetSystem, targetComponent, statusText);
        }
    }
}
