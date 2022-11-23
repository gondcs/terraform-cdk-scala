
# CDK for Terraform using Scala 3 & sbt

## Resources

From https://developer.hashicorp.com/terraform/tutorials/cdktf/cdktf-install

## Prerequisites

* The Terraform CLI (1.1+).
* Node.js and npm v16+.
* sbt
* Docker
  * If you are using mac os, please check [here](github.com/docker/for-mac/issues/6531)


## Useful commands

```bash
  cat help                Prints this message

  Compile:
    sbt compile           Compiles your Scala packages

  Compile:
    sbt test              Run test suite

  Synthesize:
    cdktf synth [stack]   Synthesize Terraform resources to cdktf.out/

  Diff:
    cdktf diff [stack]    Perform a diff (terraform plan) for the given stack

  Deploy:
    cdktf deploy [stack]  Deploy the given stack

  Destroy:
    cdktf destroy [stack] Destroy the given stack

  Learn more about using modules and providers https://cdk.tf/modules-and-providers

Use Providers:

  All prebuilt providers are available on Maven Central: https://mvnrepository.com/artifact/com.hashicorp
  You can also add these providers directly to your build.sbt file.

  You can also build any module or provider locally. Learn more: https://cdk.tf/modules-and-providers
```

