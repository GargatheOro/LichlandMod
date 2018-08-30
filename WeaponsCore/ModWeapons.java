package com.LichlandDevs.WeaponsCore;

import com.LichlandDevs.CoreTabs.ModTabs;
import com.LichlandDevs.LichlandCore.RefStrings;
import com.LichlandDevs.WeaponsMartial.BattleAxeWeapon;
import com.LichlandDevs.WeaponsMartial.ChainWeapon;
import com.LichlandDevs.WeaponsMartial.FlailWeapon;
import com.LichlandDevs.WeaponsMartial.GlaiveWeapon;
import com.LichlandDevs.WeaponsMartial.GreatAxeWeapon;
import com.LichlandDevs.WeaponsMartial.GreatSwordWeapon;
import com.LichlandDevs.WeaponsMartial.HalberdWeapon;
import com.LichlandDevs.WeaponsMartial.LanceWeapon;
import com.LichlandDevs.WeaponsMartial.LongSwordWeapon;
import com.LichlandDevs.WeaponsMartial.MaulWeapon;
import com.LichlandDevs.WeaponsMartial.MorningstarWeapon;
import com.LichlandDevs.WeaponsMartial.PikeWeapon;
import com.LichlandDevs.WeaponsMartial.RapierWeapon;
import com.LichlandDevs.WeaponsMartial.ScimitarWeapon;
import com.LichlandDevs.WeaponsMartial.ShortSwordWeapon;
import com.LichlandDevs.WeaponsMartial.TridentWeapon;
import com.LichlandDevs.WeaponsMartial.WarPickWeapon;
import com.LichlandDevs.WeaponsMartial.WarhammerWeapon;
import com.LichlandDevs.WeaponsMartial.WhipWeapon;
import com.LichlandDevs.WeaponsSimple.ClubWeapon;
import com.LichlandDevs.WeaponsSimple.DaggerWeapon;
import com.LichlandDevs.WeaponsSimple.HandAxeWeapon;
import com.LichlandDevs.WeaponsSimple.JavelinWeapon;
import com.LichlandDevs.WeaponsSimple.MaceWeapon;
import com.LichlandDevs.WeaponsSimple.QuarterstaffWeapon;
import com.LichlandDevs.WeaponsSimple.SickleWeapon;
import com.LichlandDevs.WeaponsSimple.SpearWeapon;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModWeapons {
	public static void Main() {
		initializeWeapon();
	}
	
	//TOOL MATERIALS
	public static ToolMaterial practice = EnumHelper.addToolMaterial("Practice", 0, 350, 0.0F, -4.0F, 1);
	public static ToolMaterial wood = EnumHelper.addToolMaterial("Wood", 0, 350, 0.0F, -3.0F, 1);  //ADD BANDED WOOD MATERIAL (REINFORCEMENT)
	public static ToolMaterial Mchain = EnumHelper.addToolMaterial("Chain", 0, 225, 0.0F, 2.0F, 10);
	public static ToolMaterial Mwhip = EnumHelper.addToolMaterial("Whip", 0, 85, 0.0F, -4.0F, 9);
	
	//TOOL CREATION
	public static Item practicebattleaxe;
	public static Item chain;
	public static Item club;
	public static Item practicedagger;
	public static Item practiceflail;
	public static Item practiceglaive;
	public static Item practicegreataxe;
	public static Item practicegreatsword;
	public static Item practicehalberd;
	public static Item practicehandaxe;
	public static Item practicejavelin;
	public static Item practicelance;
	public static Item practicelongsword;
	public static Item practicemace;
	public static Item practicemaul;
	public static Item practicemorningstar;
	public static Item practicepike;
	public static Item quarterstaff;
	public static Item practicerapier;
	public static Item practicescimitar;
	public static Item practiceshortsword;
	public static Item practicesickle;
	public static Item practicespear;
	public static Item practicetrident;
	public static Item practicewarhammer;
	public static Item practicewarpick;
	public static Item whip;
	
	public static void initializeWeapon(){
		practicebattleaxe = new BattleAxeWeapon(practice).setUnlocalizedName("practicebattleaxe").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicebattleaxe");
		chain = new ChainWeapon(Mchain).setUnlocalizedName("chain").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":chain");
		club = new ClubWeapon(wood).setUnlocalizedName("club").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":club");
		practicedagger = new DaggerWeapon(practice).setUnlocalizedName("practicedagger").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicedagger");
		practiceflail = new FlailWeapon(practice).setUnlocalizedName("practiceflail").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practiceflail");
		practiceglaive = new GlaiveWeapon(practice).setUnlocalizedName("practiceglaive").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practiceglaive");
		practicegreataxe = new GreatAxeWeapon(practice).setUnlocalizedName("practicegreataxe").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicegreataxe");
		practicegreatsword = new GreatSwordWeapon(practice).setUnlocalizedName("practicegreatsword").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicegreatsword");
		practicehalberd = new HalberdWeapon(practice).setUnlocalizedName("practicehalberd").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicehalberd");
		practicehandaxe = new HandAxeWeapon(practice).setUnlocalizedName("practicehandaxe").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicehandaxe");
		practicejavelin = new JavelinWeapon(practice).setUnlocalizedName("practicejavelin").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicejavelin");
		practicelance = new LanceWeapon(practice).setUnlocalizedName("practicelance").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicelance");
		practicelongsword = new LongSwordWeapon(practice).setUnlocalizedName("practicelongsword").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicelongsword");
		practicemace = new MaceWeapon(practice).setUnlocalizedName("practicemace").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicemace");
		practicemaul = new MaulWeapon(practice).setUnlocalizedName("practicemaul").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicemaul");
		practicemorningstar = new MorningstarWeapon(practice).setUnlocalizedName("practicemorningstar").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicemorningstar");
		practicepike = new PikeWeapon(practice).setUnlocalizedName("practicepike").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicepike");
		quarterstaff = new QuarterstaffWeapon(wood).setUnlocalizedName("quarterstaff").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":staff");
		practicerapier = new RapierWeapon(practice).setUnlocalizedName("practicerapier").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicerapier");
		practicescimitar = new ScimitarWeapon(practice).setUnlocalizedName("practicescimitar").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicescimitar");
		practiceshortsword = new ShortSwordWeapon(practice).setUnlocalizedName("practiceshortsword").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practiceshortsword");
		practicesickle = new SickleWeapon(practice).setUnlocalizedName("practicesickle").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicesickle");
		practicespear = new SpearWeapon(practice).setUnlocalizedName("practicespear").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicespear");
		practicetrident = new TridentWeapon(practice).setUnlocalizedName("practicetrident").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicetrident");
		practicewarhammer = new WarhammerWeapon(practice).setUnlocalizedName("practicewarhammer").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicewarhammer");
		practicewarpick = new WarPickWeapon(practice).setUnlocalizedName("practicewarpick").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":practicewarpick");
		whip = new WhipWeapon(Mwhip).setUnlocalizedName("whip").setCreativeTab(ModTabs.tabCoreWeapons).setTextureName(RefStrings.MODID + ":whip");
	}
}