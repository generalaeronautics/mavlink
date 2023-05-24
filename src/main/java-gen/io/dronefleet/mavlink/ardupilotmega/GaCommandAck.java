package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * GA Command Acknowledgement from CC 
 */
@MavlinkMessageInfo(
        id = 7005,
        crc = 67,
        description = "GA Command Acknowledgement from CC"
)
public final class GaCommandAck {
    private final int targetSystem;

    private final int targetComponent;

    private final int command;

    private final int result;

    private final String reason;

    private GaCommandAck(int targetSystem, int targetComponent, int command, int result,
            String reason) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.command = command;
        this.result = result;
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
     * command id 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "command id"
    )
    public final int command() {
        return this.command;
    }

    /**
     * 0-&gt;failed, 1-&gt;passed 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "0->failed, 1->passed"
    )
    public final int result() {
        return this.result;
    }

    /**
     * Reason of failure 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 50,
            description = "Reason of failure"
    )
    public final String reason() {
        return this.reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GaCommandAck other = (GaCommandAck)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(command, other.command)) return false;
        if (!Objects.deepEquals(result, other.result)) return false;
        if (!Objects.deepEquals(reason, other.reason)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(command);
        result = 31 * result + Objects.hashCode(result);
        result = 31 * result + Objects.hashCode(reason);
        return result;
    }

    @Override
    public String toString() {
        return "GaCommandAck{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", command=" + command
                 + ", result=" + result
                 + ", reason=" + reason + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int command;

        private int result;

        private String reason;

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
         * command id 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "command id"
        )
        public final Builder command(int command) {
            this.command = command;
            return this;
        }

        /**
         * 0-&gt;failed, 1-&gt;passed 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "0->failed, 1->passed"
        )
        public final Builder result(int result) {
            this.result = result;
            return this;
        }

        /**
         * Reason of failure 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 50,
                description = "Reason of failure"
        )
        public final Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public final GaCommandAck build() {
            return new GaCommandAck(targetSystem, targetComponent, command, result, reason);
        }
    }
}
