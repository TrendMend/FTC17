package VV;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Rulon on 2016-11-28.
 */


@TeleOp (name = "Teleop", group = "VVV")

//@disabled
public class Tele extends LinearOpMode {

    DcMotor MotorLeft;
    DcMotor MotorRight;
    double left;
    double right;
    double max;
    DcMotor Intake;
    DcMotor Shooter;

    @Override
    public void runOpMode() throws InterruptedException {
        MotorLeft = hardwareMap.dcMotor.get("MotorLeft");
        MotorRight = hardwareMap.dcMotor.get("MotorRight");
        MotorRight.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()) {
            MotorRight.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x);
            MotorLeft.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
        }


        waitForStart();
        while (opModeIsActive()) {


            //System.out.println("This work is licensed under the Creative Commons Attribution 4.0 International License under the author's name (Rulon Rock).\n To view a copy of this license, visit http://creativecommons.org/licenses/by/4.0/. \n\n\n ");


            MotorLeft.setPower(-gamepad1.left_stick_y);
            MotorRight.setPower(-gamepad1.right_stick_y);




//            if (gamepad1.dpad_up)
//            {
//                MotorLeft.setPower(-gamepad1.left_trigger);
//                motorRight.setPower(-gamepad1.right_trigger);
//            }
//            else
//            {
//                m]MotorLeft.setPower(gamepad1.left_trigger);
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
            idle();
        }
    }
}
   // @Override
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

