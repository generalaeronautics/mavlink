package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Boundary Point Request 
 */
@MavlinkMessageInfo(
        id = 7008,
        crc = 97,
        description = "Boundary Point Request"
)
public final class BoundaryRequestInt {
    private final int targetSystem;

    private final int targetComponent;

    private final int boundaryType;

    private final int seqno;

    private final int obstacleNo;

    private BoundaryRequestInt(int targetSystem, int targetComponent, int boundaryType, int seqno,
            int obstacleNo) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.boundaryType = boundaryType;
        this.seqno = seqno;
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
     * seqno 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "seqno"
    )
    public final int seqno() {
        return this.seqno;
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
        BoundaryRequestInt other = (BoundaryRequestInt)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(boundaryType, other.boundaryType)) return false;
        if (!Objects.deepEquals(seqno, other.seqno)) return false;
        if (!Objects.deepEquals(obstacleNo, other.obstacleNo)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(boundaryType);
        result = 31 * result + Objects.hashCode(seqno);
        result = 31 * result + Objects.hashCode(obstacleNo);
        return result;
    }

    @Override
    public String toString() {
        return "BoundaryRequestInt{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", boundaryType=" + boundaryType
                 + ", seqno=" + seqno
                 + ", obstacleNo=" + obstacleNo + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int boundaryType;

        private int seqno;

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
         * seqno 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "seqno"
        )
        public final Builder seqno(int seqno) {
            this.seqno = seqno;
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

        public final BoundaryRequestInt build() {
            return new BoundaryRequestInt(targetSystem, targetComponent, boundaryType, seqno, obstacleNo);
        }
    }
}
