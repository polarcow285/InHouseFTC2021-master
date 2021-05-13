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


        //Right: 105; Left: 193 --> on the ground NO tape
        //Right: 112; Left: 369 --> left sensor on tape
        //Right: 212; left: 180 --> right sensor on tape


        while(opModeIsActive()) {
            //two sensors on each side of the robot, if neither sensor senses a certain amount of white, then it will move forward


            if(rightColorSteven.alpha() <= 143 && leftColorSteven.alpha()<=197){ //LOL THIS IS AN AND SIGN NOWWW :D
                robot.rightMotor.setPower(0.3f);
                robot.leftMotor.setPower(0.3f);
            }
            //if right sensor (Steven) senses white tape, then it will turn right for ___ milliseconds to emulate a 90 degree turn
            else if(rightColorSteven.alpha()>= 197){ //this is probably too high LOL <3
                robot.leftMotor.setPower(0.3f);
                robot.rightMotor.setPower(0.3f);
                sleep(277);
                robot.rightMotor.setPower(-0.3f);
                robot.leftMotor.setPower(0.3f);
                sleep(576);//too much, like a pretty much lot. test only right turn next time

            }
            //if left sensor (also Steven) senses white tape, then it will turn left for ___ milliseconds to emulate a 90 degree turn
            else if(leftColorSteven.alpha()>= 203) { //also too high LOL
                robot.rightMotor.setPower(0.3f);
                robot.leftMotor.setPower(0.3f);
                sleep(277);
                robot.rightMotor.setPower(0.3f); //is on white for too short and so it just keeps going turning barely <3 I'M LOSING MY MIND :D
                robot.leftMotor.setPower(-0.3f);
                telemetry.addData("test", "pls work");
                telemetry.update();

                sleep(672);//i think this is a little too much too...same -angie
            }


            //might add blue start code because it might detect too much white in the BLUE tape

            //red tape end, stop and drop off minerals




            //left: 100
            //right: 77
            else if(leftColorSteven.red()>= 90 && rightColorSteven.red()>= 90){
                robot.leftMotor.setPower(0);
                robot.rightMotor.setPower(0);
                //intake stuffs
                break;
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

            //print what the amount of color the sensors are sensing on the phone -duck
            //prints to the phone the amount of white it's sensing -nli
            telemetry.addData("Right (white)", rightColorSteven.alpha());
            telemetry.addData("Left (white)", leftColorSteven.alpha());
            telemetry.addData("Right (red)", rightColorSteven.red());
            telemetry.addData("Left (red)", leftColorSteven.red());
            telemetry.update();
        }

        //if opMode isn't active, then the robot will stop
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);


    }
}
