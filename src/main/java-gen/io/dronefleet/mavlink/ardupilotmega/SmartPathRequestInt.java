package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Smart Path Point Request 
 */
@MavlinkMessageInfo(
        id = 7012,
        crc = 54,
        description = "Smart Path Point Request"
)
public final class SmartPathRequestInt {
    private final int targetSystem;

    private final int targetComponent;

    private final int seqno;

    private SmartPathRequestInt(int targetSystem, int targetComponent, int seqno) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.seqno = seqno;
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
     * seqno 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "seqno"
    )
    public final int seqno() {
        return this.seqno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SmartPathRequestInt other = (SmartPathRequestInt)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(seqno, other.seqno)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(seqno);
        return result;
    }

    @Override
    public String toString() {
        return "SmartPathRequestInt{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", seqno=" + seqno + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int seqno;

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
         * seqno 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "seqno"
        )
        public final Builder seqno(int seqno) {
            this.seqno = seqno;
            return this;
        }

        public final SmartPathRequestInt build() {
            return new SmartPathRequestInt(targetSystem, targetComponent, seqno);
        }
    }
}
