/*
Copyright (c) 2016 Robert Atkinson

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package VV;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;


//MotorLeft = hardwareMap.dcMotor.get("MotorLeft");
//        MotorRight = hardwareMap.dcMotor.get("MotorRight");
//        MotorLeft.setDirection(DcMotor.Direction.REVERSE);
//        Shooter = hardwareMap.dcMotor.get("Shooter");
//        BallIntake = hardwareMap.dcMotor.get("BallINtake");

/**
 * This file illustrates the concept of driving a path based on time.
 * It uses the common Pushbot hardware class to define the drive on the robot.
 * The code is structured as a LinearOpMode
 *
 * The code assumes that you do NOT have encoders on the wheels,
 *   otherwise you would use: PushbotAutoDriveByEncoder;
 *
 *   The desired path in this example is:
 *   - Drive forward for 3 seconds
 *   - Spin rightMotorPower for 1.3 seconds
 *   - Drive Backwards for 1 Second
 *   - Stop and close the claw.
 *
 *  The code is written in a simple form with no optimizations.
 *  However, there are several ways that this type of sequence could be streamlined,
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="EMERGENCY AUTO Left", group = "VVV")
//@Disabled
public class EMERGANCY_AUTOLeft extends LinearOpMode {

    /* Declare OpMode members. */
    //HardwarePushbot         robot   = new HardwarePushbot();   // Use a Pushbot's hardware
    private ElapsedTime     runtime = new ElapsedTime();

    DcMotor MotorLeft;
    DcMotor MotorRight;
    double left;
    double right;
    double max;
    DcMotor Intake;
    DcMotor Shooter;




    static final double     FORWARD_SPEED = 0.6;
    static final double     TURN_SPEED    = 0.5;

    static final double     SHOOT_SPEED   = 1.0;



    @Override
    public void runOpMode() {

        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class does all the work here
         */
        telemetry.addLine("Place1");
        telemetry.update();
        //robot.init(hardwareMap);

        MotorLeft = hardwareMap.dcMotor.get("MotorLeft");
        MotorRight = hardwareMap.dcMotor.get("MotorRight");
        MotorLeft.setDirection(DcMotor.Direction.REVERSE);
        try {

            Shooter = hardwareMap.dcMotor.get("Shooter");
            Intake = hardwareMap.dcMotor.get("Intake");

        }catch(Exception e ){

        }





        // Send telemetry message to signify robot waiting;
        Telemetry.Item addData = telemetry.addData("Ready to Rumble!™", runtime.seconds());
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Step through each leg of the path, ensuring that the Auto mode has not been stopped along the way

        //WORK ON INIT

        // Step 2:  Drive forward for 3 seconds

        Shooter.setPower(SHOOT_SPEED);
        Intake.setPower(0.5);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
            telemetry.addData("Step 1 Complete, Balls shooted", runtime.seconds());
            telemetry.update();
        }



        MotorLeft.setPower(-FORWARD_SPEED);
        MotorRight.setPower(-FORWARD_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.8)) {
            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
            telemetry.update();
        }

        MotorLeft.setPower(-FORWARD_SPEED);
        MotorRight.setPower(-FORWARD_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.2)){
            telemetry.addData("Step 3 Complete, hit ball", runtime.seconds());
            telemetry.update();
        }

        MotorLeft.setPower(FORWARD_SPEED);
        MotorRight.setPower(-FORWARD_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.5)){
            telemetry.addData("Step 4 Complete, Backed up", runtime.seconds());
            telemetry.update();
        }

        MotorLeft.setPower(TURN_SPEED);
        MotorRight.setPower(-TURN_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 0.4)) {
            telemetry.addData("Step 5 Complete, Turned", runtime.seconds());
            telemetry.update();
        }

        MotorLeft.setPower(FORWARD_SPEED);
        MotorRight.setPower(FORWARD_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
            telemetry.update();
        }
//
//        MotorLeft.setPower(FORWARD_SPEED);
//        MotorRight.setPower(FORWARD_SPEED);
//        runtime.reset();
//        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
//            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
//            telemetry.update();
//        }
//
//        MotorLeft.setPower(FORWARD_SPEED);
//        MotorRight.setPower(FORWARD_SPEED);
//        runtime.reset();
//        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
//            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
//            telemetry.update();
//        }
//
//        MotorLeft.setPower(FORWARD_SPEED);
//        MotorRight.setPower(FORWARD_SPEED);
//        runtime.reset();
//        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
//            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
//            telemetry.update();
//        }
//
//        MotorLeft.setPower(FORWARD_SPEED);
//        MotorRight.setPower(FORWARD_SPEED);
//        runtime.reset();
//        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
//            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
//            telemetry.update();
//        }
//
//        MotorLeft.setPower(FORWARD_SPEED);
//        MotorRight.setPower(FORWARD_SPEED);
//        runtime.reset();
//        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
//            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
//            telemetry.update();
//        }
//
//        MotorLeft.setPower(FORWARD_SPEED);
//        MotorRight.setPower(FORWARD_SPEED);
//        runtime.reset();
//        while (opModeIsActive() && (runtime.seconds() < 3.0)) {
//            telemetry.addData("Step 2 Complete, Moved forward", runtime.seconds());
//            telemetry.update();
//        }


//        robot.leftMotor.setPower(0);
//        robot.rightMotor.setPower(0);
//        robot.leftClaw.setPosition(1.0);
//        robot.rightClaw.setPosition(0.0);

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);
    }
}
