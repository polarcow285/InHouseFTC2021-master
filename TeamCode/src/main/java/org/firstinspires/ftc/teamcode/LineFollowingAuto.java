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


        //Right: 135; Left: 131 --> on the ground NO tape
        //Right: 113; Left: 366 --> left sensor on tape
        //Right: 227; left: 128 --> right sensor on tape

        while(opModeIsActive()) {
            //moving forward



            if(rightColorSteven.alpha() <= 143 || leftColorSteven.alpha()<=136){
                robot.rightMotor.setPower(0.2f);
                robot.leftMotor.setPower(0.2f);
            }
            //turning right
            else if(rightColorSteven.alpha()>= 219){ //this is probably too high LOL <3
                robot.leftMotor.setPower(0.2f);
                robot.rightMotor.setPower(0f);
                sleep(1003);
            }
            //turning left
            else if(leftColorSteven.alpha()>= 293) {
                robot.rightMotor.setPower(0.2f); //is on white for too short and so it just keeps going turning barely <3 I'M LOSING MY MIND :D
                robot.leftMotor.setPower(0f);
                sleep(1003);
            }

            /*if(colorSteven.blue()<=97) {
                robot.rightMotor.setPower(0);
                robot.leftMotor.setPower(0);
            }
            else if(colorSteven.blue()>= 100) {
                robot.rightMotor.setPower(0.5f);
                robot.leftMotor.setPower(0.5f);
            }
*/
            telemetry.addData("Right", rightColorSteven.alpha());
            telemetry.addData("Left", leftColorSteven.alpha());
            telemetry.update();
        }
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);


    }
}
