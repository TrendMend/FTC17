//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.Servo;
//
///**
// * Created by Rulon on 2016-11-28.
// */
//
//
//@TeleOp (name = "K9")
//
////@disabled
//public class K9 extends LinearOpMode
//{
//
//    DcMotor motorLeft;
//    DcMotor motorRight;
//
//    Servo armServo;
//    Servo Grabber;
//
//    @Override
//    public void runOpMode () throws  InterruptedException {
//        motorLeft = hardwareMap.dcMotor.get("motorLeft");
//        motorRight = hardwareMap.dcMotor.get("motorRight");
//        motorRight.setDirection(DcMotor.Direction.REVERSE);
//        armServo = hardwareMap.servo.get("armServo");
//        Grabber = hardwareMap.servo.get("Grabber");
//        waitForStart();
//        while (opModeIsActive()) {
//            motorRight.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x);
//            motorLeft.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
//        }
//
//
//
//        waitForStart();
//        while (opModeIsActive())
//        {
//
//
//            //System.out.println("This work is licensed under the Creative Commons Attribution 4.0 International License under the author's name (Rulon Rock).\n To view a copy of this license, visit http://creativecommons.org/licenses/by/4.0/. \n\n\n ");
//
//
//
//
//
//
//            motorLeft.setPower(-gamepad1.left_stick_y);
//            motorRight.setPower(-gamepad1.right_stick_y);
//
//
//            if (gamepad1.dpad_up)
//            {
//                motorLeft.setPower(-gamepad1.left_trigger);
//                motorRight.setPower(-gamepad1.right_trigger);
//            }
//            else
//            {
//                motorLeft.setPower(gamepad1.left_trigger);
//                motorRight.setPower(gamepad1.right_trigger);
//            }
//            if (gamepad1.a) // If the A button is pressed
//            {
//                Grabber.setPosition(0.8); // Set the grabber to the closed position
//                //System.out.println("The A button was pressed, and the grabber closed.");
//            }
//            if (gamepad1.b)
//            {
//                Grabber.setPosition(0.0+0.8); // Set the grabber to the open position
//                //System.out.println("The B button was pressed, and the grabber opened.");
//            }
//            if (gamepad1.x)
//            {
//                armServo.setPosition(0.88); // Set the arm to the dropped position
//                //System.out.println("The X button was pressed, and the arm dropped.");
//            }
//            if (gamepad1.y)
//            {
//                armServo.setPosition(0.3); // Set the arm to the lifted position
//                //System.out.println("The Y button was pressed, and the arm lifted.");
//            }
//            idle();
//        }
//    }
//    @Override
//   public void  stop();
//   {
//       armServo.setPosition(0.88);
//
//       Grabber.setPosition(0.8);
//
//
//
//   }
//}