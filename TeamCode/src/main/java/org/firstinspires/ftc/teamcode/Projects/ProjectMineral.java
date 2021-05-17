package org.firstinspires.ftc.teamcode.Projects;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProjectMineral extends Project {
    //setting up motors
    public DcMotor rightMotor = null;
    public DcMotor leftMotor = null;
    public DcMotor intakeMotor = null;

    @Override
    public void init(HardwareMap ahwMap) {
        //Save reference to Hardware map
        hwMap = ahwMap;

        //Define and Initialize Motors
        rightMotor = hwMap.dcMotor.get("rightMotor");
        leftMotor = hwMap.dcMotor.get("leftMotor");



        intakeMotor = hwMap.dcMotor.get("intakeMotor");


        //Setup Motor directions and Encoder settings
        leftMotor .setDirection(DcMotor.Direction.REVERSE);
        rightMotor .setDirection(DcMotor.Direction.FORWARD);

        leftMotor .setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        intakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftMotor .setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Set all motors to zero power
        Stop();
    }
    public void Stop(){
        rightMotor.setPower(0);
        leftMotor.setPower(0);

        intakeMotor.setPower(0);
    }

}
