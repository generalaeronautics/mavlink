package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Smart Path Item send 
 */
@MavlinkMessageInfo(
        id = 7013,
        crc = 105,
        description = "Smart Path Item send"
)
public final class SmartPathItemInt {
    private final int targetSystem;

    private final int targetComponent;

    private final int seqno;

    private final int lat;

    private final int lon;

    private final float alt;

    private SmartPathItemInt(int targetSystem, int targetComponent, int seqno, int lat, int lon,
            float alt) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.seqno = seqno;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
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

    /**
     * Latitude in deg*1e7 
     */
    @MavlinkFieldInfo(
            position = 4,
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
            position = 5,
            unitSize = 4,
            signed = true,
            description = "Longitude in deg*1e7"
    )
    public final int lon() {
        return this.lon;
    }

    /**
     * Altitude (MSL) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            description = "Altitude (MSL)"
    )
    public final float alt() {
        return this.alt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SmartPathItemInt other = (SmartPathItemInt)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(seqno, other.seqno)) return false;
        if (!Objects.deepEquals(lat, other.lat)) return false;
        if (!Objects.deepEquals(lon, other.lon)) return false;
        if (!Objects.deepEquals(alt, other.alt)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(seqno);
        result = 31 * result + Objects.hashCode(lat);
        result = 31 * result + Objects.hashCode(lon);
        result = 31 * result + Objects.hashCode(alt);
        return result;
    }

    @Override
    public String toString() {
        return "SmartPathItemInt{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", seqno=" + seqno
                 + ", lat=" + lat
                 + ", lon=" + lon
                 + ", alt=" + alt + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int seqno;

        private int lat;

        private int lon;

        private float alt;

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

        /**
         * Latitude in deg*1e7 
         */
        @MavlinkFieldInfo(
                position = 4,
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
                position = 5,
                unitSize = 4,
                signed = true,
                description = "Longitude in deg*1e7"
        )
        public final Builder lon(int lon) {
            this.lon = lon;
            return this;
        }

        /**
         * Altitude (MSL) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                description = "Altitude (MSL)"
        )
        public final Builder alt(float alt) {
            this.alt = alt;
            return this;
        }

        public final SmartPathItemInt build() {
            return new SmartPathItemInt(targetSystem, targetComponent, seqno, lat, lon, alt);
        }
    }
}
