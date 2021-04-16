package org.firstinspires.ftc.teamcode.Projects;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProjectMineral extends Project {
    //setting up motors
    public DcMotor rightMotor = null;
    public DcMotor leftMotor = null;
    public DcMotor leftIntake = null;
    public DcMotor rightIntake = null;

    @Override
    public void init(HardwareMap ahwMap) {
        //Save reference to Hardware map
        hwMap = ahwMap;

        //Define and Initialize Motors
        rightMotor = hwMap.dcMotor.get("rightMotor");
        leftMotor = hwMap.dcMotor.get("frontLeft");


        leftIntake = hwMap.dcMotor.get("leftIntake");
        rightIntake= hwMap.dcMotor.get("rightIntake");


        //Setup Motor directions and Encoder settings
        leftMotor .setDirection(DcMotor.Direction.REVERSE);
        rightMotor .setDirection(DcMotor.Direction.FORWARD);

        leftMotor .setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rightIntake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftIntake .setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftMotor .setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Set all motors to zero power
        Stop();
    }
    public void Stop(){
        rightMotor.setPower(0);
        leftMotor.setPower(0);

        rightIntake.setPower(0);
        leftIntake.setPower(0);
    }

}
