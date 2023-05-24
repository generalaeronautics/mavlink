package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * GeoFence coordinate from PA. Will be sent from RPi to GCS 
 */
@MavlinkMessageInfo(
        id = 6005,
        crc = 147,
        description = "GeoFence coordinate from PA. Will be sent from RPi to GCS"
)
public final class NpntGeofence {
    private final int targetSystem;

    private final int targetComponent;

    private final List<Integer> lat;

    private final List<Integer> lon;

    private NpntGeofence(int targetSystem, int targetComponent, List<Integer> lat,
            List<Integer> lon) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.lat = lat;
        this.lon = lon;
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
     * Latitude Array of Geofence 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            arraySize = 10,
            signed = true,
            description = "Latitude Array of Geofence"
    )
    public final List<Integer> lat() {
        return this.lat;
    }

    /**
     * Longitude Array of Geofence 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            arraySize = 10,
            signed = true,
            description = "Longitude Array of Geofence"
    )
    public final List<Integer> lon() {
        return this.lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntGeofence other = (NpntGeofence)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(lat, other.lat)) return false;
        if (!Objects.deepEquals(lon, other.lon)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(lat);
        result = 31 * result + Objects.hashCode(lon);
        return result;
    }

    @Override
    public String toString() {
        return "NpntGeofence{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", lat=" + lat
                 + ", lon=" + lon + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private List<Integer> lat;

        private List<Integer> lon;

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
         * Latitude Array of Geofence 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                arraySize = 10,
                signed = true,
                description = "Latitude Array of Geofence"
        )
        public final Builder lat(List<Integer> lat) {
            this.lat = lat;
            return this;
        }

        /**
         * Longitude Array of Geofence 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                arraySize = 10,
                signed = true,
                description = "Longitude Array of Geofence"
        )
        public final Builder lon(List<Integer> lon) {
            this.lon = lon;
            return this;
        }

        public final NpntGeofence build() {
            return new NpntGeofence(targetSystem, targetComponent, lat, lon);
        }
    }
}
