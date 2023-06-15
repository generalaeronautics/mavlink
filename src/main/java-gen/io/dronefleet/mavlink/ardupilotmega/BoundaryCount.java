package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Total number of vertical of a boundary 
 */
@MavlinkMessageInfo(
        id = 7007,
        crc = 214,
        description = "Total number of vertical of a boundary"
)
public final class BoundaryCount {
    private final int targetSystem;

    private final int targetComponent;

    private final int boundaryType;

    private final int count;

    private final int obstacleNo;

    private final int totalObstacles;

    private BoundaryCount(int targetSystem, int targetComponent, int boundaryType, int count,
            int obstacleNo, int totalObstacles) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.boundaryType = boundaryType;
        this.count = count;
        this.obstacleNo = obstacleNo;
        this.totalObstacles = totalObstacles;
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
     * count 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "count"
    )
    public final int count() {
        return this.count;
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

    /**
     * total number of obstacles 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            description = "total number of obstacles"
    )
    public final int totalObstacles() {
        return this.totalObstacles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        BoundaryCount other = (BoundaryCount)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(boundaryType, other.boundaryType)) return false;
        if (!Objects.deepEquals(count, other.count)) return false;
        if (!Objects.deepEquals(obstacleNo, other.obstacleNo)) return false;
        if (!Objects.deepEquals(totalObstacles, other.totalObstacles)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(boundaryType);
        result = 31 * result + Objects.hashCode(count);
        result = 31 * result + Objects.hashCode(obstacleNo);
        result = 31 * result + Objects.hashCode(totalObstacles);
        return result;
    }

    @Override
    public String toString() {
        return "BoundaryCount{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", boundaryType=" + boundaryType
                 + ", count=" + count
                 + ", obstacleNo=" + obstacleNo
                 + ", totalObstacles=" + totalObstacles + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int boundaryType;

        private int count;

        private int obstacleNo;

        private int totalObstacles;

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
         * count 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "count"
        )
        public final Builder count(int count) {
            this.count = count;
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

        /**
         * total number of obstacles 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                description = "total number of obstacles"
        )
        public final Builder totalObstacles(int totalObstacles) {
            this.totalObstacles = totalObstacles;
            return this;
        }

        public final BoundaryCount build() {
            return new BoundaryCount(targetSystem, targetComponent, boundaryType, count, obstacleNo, totalObstacles);
        }
    }
}
