package net.esa.extremesnowadventures.common.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class WinterGearArmor extends ArmorItem {

    public WinterGearArmor(EquipmentSlot type, Properties properties) {
        super(new ArmorMaterial() {

            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
            }

            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{2, 5, 6, 2}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_LEATHER;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }

            @Override
            public String getName() {
                return "winter";
            }

            @Override
            public float getToughness() {
                return 2.1f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, type, properties);
    }

    public static class Helmet extends WinterGearArmor {

        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "extremesnowadventures:textures/models/armor/wintergear_layer_1.png";
        }

    }

    public static class Chestplate extends WinterGearArmor {

        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "extremesnowadventures:textures/models/armor/wintergear_layer_1.png";
        }

    }

    public static class Leggings extends WinterGearArmor {

        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "extremesnowadventures:textures/models/armor/wintergear_layer_2.png";
        }

    }

    public static class Boots extends WinterGearArmor {

        public Boots() {
            super(EquipmentSlot.FEET, new Properties());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "extremesnowadventures:textures/models/armor/wintergear_layer_1.png";
        }

    }

}