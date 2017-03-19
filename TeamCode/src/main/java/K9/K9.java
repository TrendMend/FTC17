package K9;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.util.RobotLog;


/**
 * Created by Rulon on 2016-11-28.
 */


@TeleOp (name = "TeleopTankFIXED2", group = "test")

//@disabled
public class K9 extends LinearOpMode {

    DcMotor MotorLeft;
    DcMotor MotorRight;
    double left;
    double right;
    double max;
    Servo Arm;
    Servo Grabber;

    @Override
    public void runOpMode() throws InterruptedException {
        MotorLeft = hardwareMap.dcMotor.get("MotorLeft");
        MotorRight = hardwareMap.dcMotor.get("MotorRight");
        Arm = hardwareMap.servo.get("Arm");
        Grabber = hardwareMap.servo.get("Grabber");
        MotorRight.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()) {

            left = -gamepad1.left_stick_y;
            right = -gamepad1.right_stick_y;
            MotorLeft.setPower(left);
            MotorRight.setPower(right);


            if (gamepad1.a) // If the A button is pressed
            {
                Grabber.setPosition(0.8); // Set the grabber to the closed position
                //System.out.println("The A button was pressed, and the grabber closed.");
            }
            if (gamepad1.b)
            {
                Grabber.setPosition(0.0+0.8); // Set the grabber to the open position
                //System.out.println("The B button was pressed, and the grabber opened.");
            }
            if (gamepad1.x)
            {
                Arm.setPosition(0.88); // Set the arm to the dropped position
                //System.out.println("The X button was pressed, and the arm dropped.");
            }
            if (gamepad1.y)
            {
               Arm.setPosition(0.3); // Set the arm to the lifted position
                //System.out.println("The Y button was pressed, and the arm lifted.");
            }


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

