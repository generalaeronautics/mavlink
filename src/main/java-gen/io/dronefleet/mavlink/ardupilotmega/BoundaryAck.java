package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Boundary ACK 
 */
@MavlinkMessageInfo(
        id = 7010,
        crc = 180,
        description = "Boundary ACK"
)
public final class BoundaryAck {
    private final int targetSystem;

    private final int targetComponent;

    private final int boundaryType;

    private final String ack;

    private final int obstacleNo;

    private BoundaryAck(int targetSystem, int targetComponent, int boundaryType, String ack,
            int obstacleNo) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.boundaryType = boundaryType;
        this.ack = ack;
        this.obstacleNo = obstacleNo;
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
     * Boundary Type (0 for boundary and 1 for obstacle) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "Boundary Type (0 for boundary and 1 for obstacle)"
    )
    public final int boundaryType() {
        return this.boundaryType;
    }

    /**
     * Key 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            arraySize = 20,
            description = "Key"
    )
    public final String ack() {
        return this.ack;
    }

    /**
     * key 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            description = "key"
    )
    public final int obstacleNo() {
        return this.obstacleNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        BoundaryAck other = (BoundaryAck)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(boundaryType, other.boundaryType)) return false;
        if (!Objects.deepEquals(ack, other.ack)) return false;
        if (!Objects.deepEquals(obstacleNo, other.obstacleNo)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(boundaryType);
        result = 31 * result + Objects.hashCode(ack);
        result = 31 * result + Objects.hashCode(obstacleNo);
        return result;
    }

    @Override
    public String toString() {
        return "BoundaryAck{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", boundaryType=" + boundaryType
                 + ", ack=" + ack
                 + ", obstacleNo=" + obstacleNo + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int boundaryType;

        private String ack;

        private int obstacleNo;

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
         * Boundary Type (0 for boundary and 1 for obstacle) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "Boundary Type (0 for boundary and 1 for obstacle)"
        )
        public final Builder boundaryType(int boundaryType) {
            this.boundaryType = boundaryType;
            return this;
        }

        /**
         * Key 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                arraySize = 20,
                description = "Key"
        )
        public final Builder ack(String ack) {
            this.ack = ack;
            return this;
        }

        /**
         * key 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                description = "key"
        )
        public final Builder obstacleNo(int obstacleNo) {
            this.obstacleNo = obstacleNo;
            return this;
        }

        public final BoundaryAck build() {
            return new BoundaryAck(targetSystem, targetComponent, boundaryType, ack, obstacleNo);
        }
    }
}
