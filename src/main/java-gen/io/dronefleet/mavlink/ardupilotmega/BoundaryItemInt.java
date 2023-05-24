package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Boundary Item send 
 */
@MavlinkMessageInfo(
        id = 7008,
        crc = 239,
        description = "Boundary Item send"
)
public final class BoundaryItemInt {
    private final int targetSystem;

    private final int targetComponent;

    private final int boundaryType;

    private final int seqno;

    private final int lat;

    private final int lon;

    private final int margin;

    private final int obstacleNo;

    private BoundaryItemInt(int targetSystem, int targetComponent, int boundaryType, int seqno,
            int lat, int lon, int margin, int obstacleNo) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.boundaryType = boundaryType;
        this.seqno = seqno;
        this.lat = lat;
        this.lon = lon;
        this.margin = margin;
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
            description = "Boundary Type (0 for boundary and 1 for\n"
                            + "        obstacle)"
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
     * Latitude in deg*1e7 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            signed = true,
            description = "Latitude in deg*1e7"
    )
    public final int lat() {
        return this.lat;
    }

    /**
     * Longitude in deg*1e7 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            signed = true,
            description = "Longitude in deg*1e7"
    )
    public final int lon() {
        return this.lon;
    }

    /**
     * Margin in centimeter 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            signed = true,
            description = "Margin in centimeter"
    )
    public final int margin() {
        return this.margin;
    }

    /**
     * key 
     */
    @MavlinkFieldInfo(
            position = 8,
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
        BoundaryItemInt other = (BoundaryItemInt)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(boundaryType, other.boundaryType)) return false;
        if (!Objects.deepEquals(seqno, other.seqno)) return false;
        if (!Objects.deepEquals(lat, other.lat)) return false;
        if (!Objects.deepEquals(lon, other.lon)) return false;
        if (!Objects.deepEquals(margin, other.margin)) return false;
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
        result = 31 * result + Objects.hashCode(lat);
        result = 31 * result + Objects.hashCode(lon);
        result = 31 * result + Objects.hashCode(margin);
        result = 31 * result + Objects.hashCode(obstacleNo);
        return result;
    }

    @Override
    public String toString() {
        return "BoundaryItemInt{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", boundaryType=" + boundaryType
                 + ", seqno=" + seqno
                 + ", lat=" + lat
                 + ", lon=" + lon
                 + ", margin=" + margin
                 + ", obstacleNo=" + obstacleNo + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int boundaryType;

        private int seqno;

        private int lat;

        private int lon;

        private int margin;

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
                description = "Boundary Type (0 for boundary and 1 for\n"
                                + "        obstacle)"
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
         * Latitude in deg*1e7 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                signed = true,
                description = "Latitude in deg*1e7"
        )
        public final Builder lat(int lat) {
            this.lat = lat;
            return this;
        }

        /**
         * Longitude in deg*1e7 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                signed = true,
                description = "Longitude in deg*1e7"
        )
        public final Builder lon(int lon) {
            this.lon = lon;
            return this;
        }

        /**
         * Margin in centimeter 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                signed = true,
                description = "Margin in centimeter"
        )
        public final Builder margin(int margin) {
            this.margin = margin;
            return this;
        }

        /**
         * key 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1,
                description = "key"
        )
        public final Builder obstacleNo(int obstacleNo) {
            this.obstacleNo = obstacleNo;
            return this;
        }

        public final BoundaryItemInt build() {
            return new BoundaryItemInt(targetSystem, targetComponent, boundaryType, seqno, lat, lon, margin, obstacleNo);
        }
    }
}
