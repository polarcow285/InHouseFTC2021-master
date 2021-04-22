package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Projects.ProjectMineral;


@TeleOp(name="Teleop", group="Mecanum")
//'tag' that displays the opMode on the phone
public class Teleop extends LinearOpMode {
    private ProjectMineral robot = new ProjectMineral();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);

        //wait for the Play button to be pressed
        waitForStart();

        while(opModeIsActive()) {
            //teleop code here
        //
            robot.leftMotor.setPower(gamepad1.left_stick_y);
            robot.rightMotor.setPower(gamepad1.right_stick_y);

            if(gamepad1.x == true) {
                robot.intakeMotor.setPower(0.5f);
            }

            //movement
            robot.leftMotor.setPower(gamepad1.left_stick_y);
            robot.rightMotor.setPower(gamepad1.right_stick_y);

            //intake
            if(gamepad1.x == true){
                robot.intakeMotor.setPower(0.5f);
            }

            else{
                robot.intakeMotor.setPower(0);
            }

            if(gamepad1.y == true){
                robot.intakeMotor.setPower(-0.5f);
            }

            else{
                robot.intakeMotor.setPower(0);
            }
        }

        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);
        robot.intakeMotor.setPower(0);

    }
}
