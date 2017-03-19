///*
//Copyright (c) 2016 Robert Atkinson
//
//All rights reserved.
//
//Redistribution and use in source and binary forms, with or without modification,
//are permitted (subject to the limitations in the disclaimer below) provided that
//the following conditions are met:
//
//Redistributions of source code must retain the above copyright notice, this list
//of conditions and the following disclaimer.
//
//Redistributions in binary form must reproduce the above copyright notice, this
//list of conditions and the following disclaimer in the documentation and/or
//other materials provided with the distribution.
//
//Neither the name of Robert Atkinson nor the names of his contributors may be used to
//endorse or promote products derived from this software without specific prior
//written permission.
//
//NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
//LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
//"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
//THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
//ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
//FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
//DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
//SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
//CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
//TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
//THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//*/
//
//
////public class Base_EDITED extends LinearOpMode
////{
////
////
////    @Override
////    public void runOpMode() throws InterruptedException {
////
////    }
////
////    @Override
////    private void init()
////    {
////
////
////
////    }
////
////    @Override
////    public v  oid start()
////    {
////
////
////
////    }
////
////    @Override
////    public void loop()
////    {
////
////
////
////    }
////
////    @Override
////    public void stop()
////    {
////
////
////
////    }
////
////
//
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.util.Range;
//
//import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;
//
///**
// * This OpMode uses the common Pushbot hardware class to define the devices on the robot.
// * All device access is managed through the HardwarePushbot class.
// * The code is structured as a LinearOpMode
// *
// * This particular OpMode executes a POV Game style Teleop for a PushBot
// * In this mode the leftMotorPower stick moves the robot FWD and back, the Right stick turns leftMotorPower and rightMotorPower.
// * It raises and lowers the claw using the Gampad Y and A buttons respectively.
// * It also opens and closes the claws slowly using the leftMotorPower and rightMotorPower Bumper buttons.
// *
// * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
// * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
// */
//
//@Autonomous(name="Pushbot: Autonomous", group="Pushbot")
////@Disabled
//public class Autonomous extends LinearOpMode {
//
//    /* Declare OpMode members. */
//
//
//
//    HardwarePushbot robot = new HardwarePushbot();   // Use a Pushbot's hardware
//                                                               // could also use HardwarePushbotMatrix class.
//
//   int motorleft;
//   int motorRight;
//   int flipp
//
//    double           clawOffset      = 0;                       // Servo mid position
//    final double    CLAW_SPEED      = 0.02 ;                   // sets rate to move servo
//    double leftMotorPower;
//    double rightMotorPower;
//    double maxPower;
//    motorleft = hardwareMap.dcMotor.get("motorLeft");
//    motorRight = hardwareMap.dcMotor.get("motorRight");
//    motorRight.setDirection(DcMotor.Direction.REVERSE);
//    flipper = hardwareMap.dcMotor.get("flipper");
////    Grabber = hardwareMap.servo.get("Grabber")
//
//
//
//
//    waitForStart();
//    @Override
//    public void runOpMode() {
//
//
//
//
//        /* Initialize the hardware variables.
//         * The init() method of the hardware class does all the work here
//         */
//        robot.init(hardwareMap);
//
//        // Send telemetry message to signify robot waiting;
//        telemetry.addData("Say", "Hello Driver");    //
//        telemetry.update();
//
//        // Wait for the game to start (driver presses PLAY)
//        waitForStart();
//        driveForwardTime(0.5, 500);
//        turnLeftTime(0.5, 500);
//
//        // run until the end of the match (driver presses STOP)
//
//    }
//    public void driveForwardTime(double power,long time) throws InterruptedException{
//        motorLeft.setPower(power);
//        motorRight.setPower(power);
//        Thread.sleep(time);
//    }
//    public void turnLeftTime(double power, long time) throws InterruptedException{
//        motorLeft.setPower(-power);
//        motorRight.setPower(power);
//        Thread.sleep(time);
//    }
//    public void turnLeftTime(double power, long time ) throws InterruptedException{
//        motorLeft.setPower(power);
//        motorRight.setPower(-power);
//        Thread.sleep(time);
//    }
//
//