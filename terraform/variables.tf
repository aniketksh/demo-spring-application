variable "aws_access_key" {
  # set aws access key
  default = ""
}

variable "aws_secret_key" {
  # set aws secret key
  default = ""
}

variable "region" {
  default = "us-east-2"
}

variable "lambda_payload_filename" {
  default = "target/demo-application-0.0.1-SNAPSHOT.jar"
}

variable "lambda_function_handler" {
  default = "com.demoapplication.handler.LambdaHandler"
}

variable "lambda_runtime" {
  default = "java8"
}

variable "api_path" {
  default = "{proxy+}"
}

variable "api_env_stage_name" {
  default = "terraform-lambda-java-stage"
}
