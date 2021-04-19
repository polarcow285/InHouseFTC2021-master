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

        }
    }
}
