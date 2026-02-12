package com.lays24mc.undergroundbiomesconstructsreworked;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue PLACED_GNEISS_BLOCK = BUILDER
            .comment(" Gneiss Generation Settings ")
            .comment(" Determines if Gneiss should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Gneiss and all dependent blocks")
            .defineInRange("shouldGenerateGneiss", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_ECLOGITE_BLOCK = BUILDER
            .comment(" Eclogite Generation Settings ")
            .comment(" Determines if Eclogite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Eclogite and all dependent blocks")
            .defineInRange("shouldGenerateEclogite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_MARBLE_BLOCK = BUILDER
            .comment(" Marble Generation Settings ")
            .comment(" Determines if Marble should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Marble and all dependent blocks")
            .defineInRange("shouldGenerateMarble", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_BLUESCHIST_BLOCK = BUILDER
            .comment(" Blueschist Generation Settings ")
            .comment(" Determines if Blueschist should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Blueschist and all dependent blocks")
            .defineInRange("shouldGenerateBlueschist", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_GREENSCHIST_BLOCK = BUILDER
            .comment(" Greenschist Generation Settings ")
            .comment(" Determines if Greenschist should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Greenschist and all dependent blocks")
            .defineInRange("shouldGenerateGreenschist", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_SOAPSTONE_BLOCK = BUILDER
            .comment(" Soapstone Generation Settings ")
            .comment(" Determines if Soapstone should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Soapstone and all dependent blocks")
            .defineInRange("shouldGenerateSoapstone", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_MIGMATITE_BLOCK = BUILDER
            .comment(" Migmatite Generation Settings ")
            .comment(" Determines if Migmatite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Migmatite and all dependent blocks")
            .defineInRange("shouldGenerateMigmatite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_LIMESTONE_BLOCK = BUILDER
            .comment(" Limestone Generation Settings ")
            .comment(" Determines if Limestone should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Limestone and all dependent blocks")
            .defineInRange("shouldGenerateLimestone", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_CHALK_BLOCK = BUILDER
            .comment(" Chalk Generation Settings ")
            .comment(" Determines if Chalk should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Chalk and all dependent blocks")
            .defineInRange("shouldGenerateChalk", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_SHALE_BLOCK = BUILDER
            .comment(" Shale Generation Settings ")
            .comment(" Determines if Shale should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Shale and all dependent blocks")
            .defineInRange("shouldGenerateShale", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_SILTSTONE_BLOCK = BUILDER
            .comment(" Siltstone Generation Settings ")
            .comment(" Determines if Siltstone should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Siltstone and all dependent blocks")
            .defineInRange("shouldGenerateSiltstone", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_LIGNITE_BLOCK = BUILDER
            .comment(" Lignite Generation Settings ")
            .comment(" Determines if Lignite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Lignite and all dependent blocks")
            .defineInRange("shouldGenerateLignite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_DOLOMITE_BLOCK = BUILDER
            .comment(" Dolomite Generation Settings ")
            .comment(" Determines if Dolomite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Dolomite and all dependent blocks")
            .defineInRange("shouldGenerateDolomite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_GREYWACKE_BLOCK = BUILDER
            .comment(" Greywacke Generation Settings ")
            .comment(" Determines if Greywacke should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Greywacke and all dependent blocks")
            .defineInRange("shouldGenerateGreywacke", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_CHERT_BLOCK = BUILDER
            .comment(" Chert Generation Settings ")
            .comment(" Determines if Chert should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Chert and all dependent blocks")
            .defineInRange("shouldGenerateChert", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_RED_GRANITE_BLOCK = BUILDER
            .comment(" Red Granite Generation Settings ")
            .comment(" Determines if Red Granite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Red Granite and all dependent blocks")
            .defineInRange("shouldGenerateRedGranite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_BLACK_GRANITE_BLOCK = BUILDER
            .comment(" Black Granite Generation Settings ")
            .comment(" Determines if Black Granite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Black Granite and all dependent blocks")
            .defineInRange("shouldGenerateBlackGranite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_RHYOLITE_BLOCK = BUILDER
            .comment(" Rhyolite Generation Settings ")
            .comment(" Determines if Rhyolite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Rhyolite and all dependent blocks")
            .defineInRange("shouldGenerateRhyolite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_GABBRO_BLOCK = BUILDER
            .comment(" Gabbro Generation Settings ")
            .comment(" Determines if Gabbro should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Gabbro and all dependent blocks")
            .defineInRange("shouldGenerateGabbro", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_KOMATIITE_BLOCK = BUILDER
            .comment(" Komatiite Generation Settings ")
            .comment(" Determines if Komatiite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Komatiite and all dependent blocks")
            .defineInRange("shouldGenerateKomatiite", 2, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue PLACED_DACITE_BLOCK = BUILDER
            .comment(" Dacite Generation Settings ")
            .comment(" Determines if Dacite should be added to world generation and which chance of generation in a chunk")
            .comment(" 0 = Disables Dacite and all dependent blocks")
            .defineInRange("shouldGenerateDacite", 2, 0, Integer.MAX_VALUE);

    static final ModConfigSpec SPEC = BUILDER.build();

}
