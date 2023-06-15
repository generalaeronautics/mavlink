package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Total number of vertical of a smart path 
 */
@MavlinkMessageInfo(
        id = 7012,
        crc = 195,
        description = "Total number of vertical of a smart path"
)
public final class SmartPathCount {
    private final int targetSystem;

    private final int targetComponent;

    private final int count;

    private SmartPathCount(int targetSystem, int targetComponent, int count) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.count = count;
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
     * count 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "count"
    )
    public final int count() {
        return this.count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SmartPathCount other = (SmartPathCount)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(count, other.count)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(count);
        return result;
    }

    @Override
    public String toString() {
        return "SmartPathCount{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", count=" + count + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int count;

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
         * count 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "count"
        )
        public final Builder count(int count) {
            this.count = count;
            return this;
        }

        public final SmartPathCount build() {
            return new SmartPathCount(targetSystem, targetComponent, count);
        }
    }
}
