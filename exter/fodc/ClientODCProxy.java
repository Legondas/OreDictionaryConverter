package exter.fodc;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientODCProxy extends CommonODCProxy
{
  public void Init()
  {
    MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
    MinecraftForgeClient.preloadTexture(ITEMS_PNG);
    
  }

}
