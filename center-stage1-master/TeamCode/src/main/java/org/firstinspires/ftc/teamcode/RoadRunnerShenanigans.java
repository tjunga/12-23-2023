package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.detection.RedPipeline;

public class RoadRunnerShenanigans extends LinearOpMode {
    public void runOpMode() {
        Drivetrain hazel = new Drivetrain(this);
        Mechanisms mech = new Mechanisms(this);
        RedPipeline pipeline = new RedPipeline(this, hardwareMap);


        pipeline.initializeCamera();
        hazel.initDrivetrain(hardwareMap);
        hazel.initGyuro(hardwareMap);
        mech.initMechanisms(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("Region1 Brightness", pipeline.getRegion1Y());
            telemetry.addData("Region2 Brightness", pipeline.getRegion2Y());
            telemetry.addData("Position", pipeline.getPosition());
            telemetry.update();
            //Trajectory traj = drive.trajectoryBuilder(new Pose2d(71.2,36.4, Math.toRadians(-90)), Math.toRadians(-90))
           //         .splineToSplineHeading(new Pose2d(60.4,56.4, Math.toRadians(-90)), Math.toRadians(-90))
          //          .splineToSplineHeading(new Pose2d(36.4,58, Math.toRadians(91)), Math.toRadians(91))
           //         .build();
            break;
        }
    }
}