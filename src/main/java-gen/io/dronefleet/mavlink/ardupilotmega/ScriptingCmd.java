package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 *  
 */
@MavlinkEnum
public enum ScriptingCmd {
    /**
     * Start a REPL session. 
     */
    @MavlinkEntryInfo(0)
    SCRIPTING_CMD_REPL_START,

    /**
     * End a REPL session. 
     */
    @MavlinkEntryInfo(1)
    SCRIPTING_CMD_REPL_STOP
}
