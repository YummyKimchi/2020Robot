/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.chargerrobotics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //XboxController ids
    public static final int primary = 0;
    public static final int secondary = 1;

    //CAN Id's
    public static final int shooterID = 5;

    //shooter constants
    public static final int shooterTargetRPM = 500;
    public static final double shooterkP = 1.0;
    public static final double shooterkI = 0.0;
    public static final double shooterkD = 0.0;
    public static final double shooterFeedForward = 1.0;
    public static final double shooterStaticGain = 0.0;
    public static final double shooterVelocityGain = 0.0;
    public static final double shooterMinOutput = -1.0;
    public static final double shooterMaxOutput = 1.0;
}
