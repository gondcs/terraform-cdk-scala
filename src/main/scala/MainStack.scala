import com.hashicorp.cdktf.TerraformStack
import software.constructs.Construct
import com.hashicorp.cdktf.providers.docker.provider.DockerProvider
import com.hashicorp.cdktf.providers.docker.image.Image
import com.hashicorp.cdktf.providers.docker.container.Container
import com.hashicorp.cdktf.providers.docker.container.ContainerPorts

import scala.jdk.CollectionConverters.*

// From: https://developer.hashicorp.com/terraform/tutorials/cdktf/cdktf-install
class MainStack(val scope: Construct, val id: String) extends TerraformStack(scope, id):
  DockerProvider.Builder.create(this, "docker")
    .build();

  val image = Image.Builder.create(this, "nginxImage")
    .name("nginx:latest")
    .keepLocally(false)
    .build()

  val containerPorts =
    Seq(ContainerPorts.builder().internal(80).external(8000).build())

  Container.Builder.create(this, "nginxContainer")
    .image(image.getLatest)
    .name("tutorial")
    .ports(containerPorts.asJava)
    .build()
