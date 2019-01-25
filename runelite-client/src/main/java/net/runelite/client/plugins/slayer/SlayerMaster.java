package net.runelite.client.plugins.slayer;

import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;

enum SlayerMaster
{
	TURAEL("Turael", "turael"),
	MAZCHNA("Mazchna", "mazchna"),
	CHAELDAR("Chaeldar", "chaeldar"),
	VANNAKA("Vannaka", "vannaka"),
	NIEVE("Nieve", "nieve"),
	Duradel("Duradel", "duradel"),
	KONAR("Konar", "konar");

	private String pretty_name;
	private String icon_name;
	private static final String relative_dir = "slayermastericons/";

	SlayerMaster(String pretty_name, String icon_name)
	{
		this.pretty_name = pretty_name;
		this.icon_name = icon_name;
	}

	public String getPrettyName()
	{
		return pretty_name;
	}


	public BufferedImage getImage()
	{
		return ImageUtil.getResourceStreamFromClass(SlayerPlugin.class, relative_dir + icon_name + ".png");
	}


}