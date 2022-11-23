// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
// Also, https://cdk.tf/testing

import com.hashicorp.cdktf.{TerraformStack, Testing}
import com.hashicorp.cdktf.providers.docker.container.Container
import com.hashicorp.cdktf.providers.docker.image.Image

import scala.jdk.CollectionConverters.*

class MainStackSpec extends munit.FunSuite:

  private lazy val sut = new MainStack(Testing.app(), "stack")
  private lazy val synthesized = Testing.synth(sut)

  test("should contain container") {
    assert(Testing.toHaveResource(synthesized, Container.TF_RESOURCE_TYPE))
  }

  test("should use nginx:latest") {
    val expectedProps = Map("name" -> "nginx:latest").asJava
    assert(Testing.toHaveResourceWithProperties(synthesized, Image.TF_RESOURCE_TYPE, expectedProps))
  }

  test("should be valid terraform") {
    assert(Testing.toBeValidTerraform(Testing.fullSynth(sut)))
  }
