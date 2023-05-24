package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;

/**
 * GA Command send from GCS 
 */
@MavlinkMessageInfo(
        id = 7004,
        crc = 38,
        description = "GA Command send from GCS"
)
public final class GaCommand {
    private final int targetSystem;

    private final int targetComponent;

    private final BigInteger timeUnixUsec;

    private final int command;

    private GaCommand(int targetSystem, int targetComponent, BigInteger timeUnixUsec, int command) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.timeUnixUsec = timeUnixUsec;
        this.command = command;
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
     * Timestamp (UNIX epoch time). 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 8,
            description = "Timestamp (UNIX epoch time)."
    )
    public final BigInteger timeUnixUsec() {
        return this.timeUnixUsec;
    }

    /**
     * command id 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "command id"
    )
    public final int command() {
        return this.command;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GaCommand other = (GaCommand)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(timeUnixUsec, other.timeUnixUsec)) return false;
        if (!Objects.deepEquals(command, other.command)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(timeUnixUsec);
        result = 31 * result + Objects.hashCode(command);
        return result;
    }

    @Override
    public String toString() {
        return "GaCommand{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", timeUnixUsec=" + timeUnixUsec
                 + ", command=" + command + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private BigInteger timeUnixUsec;

        private int command;

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
         * Timestamp (UNIX epoch time). 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 8,
                description = "Timestamp (UNIX epoch time)."
        )
        public final Builder timeUnixUsec(BigInteger timeUnixUsec) {
            this.timeUnixUsec = timeUnixUsec;
            return this;
        }

        /**
         * command id 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "command id"
        )
        public final Builder command(int command) {
            this.command = command;
            return this;
        }

        public final GaCommand build() {
            return new GaCommand(targetSystem, targetComponent, timeUnixUsec, command);
        }
    }
}
