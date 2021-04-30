package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Projects.ProjectMineral;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.ColorSensor;

@Autonomous(name="Autonomous", group="Mecanum")
//'tag' that displays the opMode on the phone
public class LineFollowingAuto extends LinearOpMode {
    public ProjectMineral robot = new ProjectMineral();
    ColorSensor rightColorSteven;
    ColorSensor leftColorSteven;

    @Override
    public void runOpMode() throws InterruptedException {

        //Initialize with hardwareMap configuration
        robot.init(hardwareMap);
        //hardware mapping the color sensors
        leftColorSteven = hardwareMap.get(ColorSensor.class, "leftColorSteven");
        rightColorSteven = hardwareMap.get(ColorSensor.class, "rightColorSteven");
        waitForStart();

        //autonomous code here
        //temporary autonomous

        //Right: 134; Left: 122 --> on the ground NO tape
        //Right: 106; Left: 124 --> left sensor on tape
        //Right: 105; Left: 168 --> right sensor on tape
        while(true) {
            //moving forward


            /*
            if(rightColorSteven.blue() <= 87 || leftColorSteven.blue()<=87){
                robot.rightMotor.setPower(0.5f);
                robot.leftMotor.setPower(0.5f);
            }
            //turning right
            else if(rightColorSteven.blue()>= 110){
                robot.leftMotor.setPower(0.5f);
                robot.rightMotor.setPower(0f);
                sleep(1003);
            }
            //turning left
            else if(leftColorSteven.blue()>= 110) {
                robot.rightMotor.setPower(0.5f);
                robot.leftMotor.setPower(0f);
                sleep(1003);
            }
            */
            /*if(colorSteven.blue()<=97) {
                robot.rightMotor.setPower(0);
                robot.leftMotor.setPower(0);
            }
            else if(colorSteven.blue()>= 100) {
                robot.rightMotor.setPower(0.5f);
                robot.leftMotor.setPower(0.5f);
            }
*/
            telemetry.addData("Right", rightColorSteven.blue());
            telemetry.addData("Left", leftColorSteven.blue());
            telemetry.update();
        }


    }
}
