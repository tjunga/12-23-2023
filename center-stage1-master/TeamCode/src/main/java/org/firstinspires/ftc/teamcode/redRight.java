package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.detection.RedPipeline;

@Autonomous
public class redRight extends LinearOpMode{
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

            int position = pipeline.getPosition();



            if(position == 1){
                mech.closeClaws();
                hazel.drive(-900, 0.3);
                hazel.wait(500);
                hazel.strafe(-450, 0.3, "right");
                hazel.turn(90, 0.5, "right");
                mech.axle1.setTargetPosition(4000);
                mech.axle2.setTargetPosition(4000);
                mech.axle1.setPower(0.8);
                mech.axle2.setPower(0.8);
                mech.axle1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.axle2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.viperSlide.setTargetPosition(1000);
                mech.viperSlide.setPower(0.4);
                mech.viperSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                hazel.wait(3000);
                mech.setPivotScore();
                hazel.wait(1000);
                mech.leftClawOpen();
                hazel.wait(3000);
                mech.zeroPosition();
                hazel.turn(90, 0.5, "left");
                hazel.turn(90, 0.5, "left");
                hazel.drive(600, 0.5);
                hazel.strafe(200, 0.5, "right");
                mech.viperSlide.setTargetPosition(850);
                mech.viperSlide.setPower(0.4);
                mech.viperSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.axle1.setTargetPosition(1350);
                mech.axle2.setTargetPosition(1350);
                mech.axle1.setPower(0.8);
                mech.axle2.setPower(0.8);
                mech.axle1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.axle2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                hazel.wait(2000);
                mech.rightClawOpen();
                hazel.wait(1500);
                //hazel.strafe(400, 0.5, "left");
                hazel.wait(500);
                mech.zeroPosition();
                hazel.wait(30000000);

            }
            else if(position == 2){
                //mech.closeClaws();
                hazel.drive(-100,0.5);
                hazel.turn(90, 0.5, "right");
                hazel.turn(75,0.5,"right");
                hazel.drive(400,0.5);
                hazel.strafe(200,0.3,"left");
                hazel.wait(500);
                mech.axle1.setTargetPosition(4000);
                mech.axle2.setTargetPosition(4000);
                mech.axle1.setPower(0.8);
                mech.axle2.setPower(0.8);
                mech.axle1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.axle2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.viperSlide.setTargetPosition(750);
                mech.viperSlide.setPower(0.4);
                mech.viperSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                hazel.wait(3000);
                mech.setPivotScore();
                hazel.wait(1000);
                mech.leftClawOpen();
                hazel.wait(5000);
                mech.zeroPosition();
                hazel.wait(2000);
                hazel.wait(30000000);


            }
            else if(position == 3){
                mech.closeClaws();
                hazel.drive(-100,0.5);
                hazel.turn(90, 0.5, "right");
                hazel.turn(75,0.5,"right");
                hazel.strafe(600, 0.5, "left");
                hazel.turn(60, 0.5, "left");
                mech.axle1.setTargetPosition(4000);
                mech.axle2.setTargetPosition(4000);
                mech.axle1.setPower(0.8);
                mech.axle2.setPower(0.8);
                mech.axle1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.axle2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                mech.viperSlide.setTargetPosition(1000);
                mech.viperSlide.setPower(0.4);
                mech.viperSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                hazel.wait(3000);
                mech.setPivotScore();
                hazel.wait(1000);
                mech.leftClawOpen();
                hazel.wait(5000);
                mech.zeroPosition();
                hazel.wait(30000000);

            }


        }

    }
}

