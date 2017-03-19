package VV;

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
public class Tele_Tank extends LinearOpMode {

    DcMotor MotorLeft;
    DcMotor MotorRight;
    double left;
    double right;
    double max;
    DcMotor intake;
    DcMotor shooter;

    @Override
    public void runOpMode() throws InterruptedException {
        MotorLeft = hardwareMap.dcMotor.get("MotorLeft");
        MotorRight = hardwareMap.dcMotor.get("MotorRight");
        intake = hardwareMap.dcMotor.get("Intake");
        shooter = hardwareMap.dcMotor.get("Shooter");
        MotorRight.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()) {

            left = -gamepad1.left_stick_y;
            right = -gamepad1.right_stick_y;
            MotorLeft.setPower(left);
            MotorRight.setPower(right);


            if (gamepad2.left_bumper){

                shooter.setPower(1.0);


            }

            if (gamepad2.a){

                intake.setPower(1.0);

            }

            if (gamepad2.right_bumper){

                shooter.setPower(0.0);
            }

            if (gamepad2.b){

                intake.setPower(0.0);
            }

            if (gamepad2.x){

                intake.setPower(-1.0);
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

