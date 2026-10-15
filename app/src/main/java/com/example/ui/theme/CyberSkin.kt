package com.example.ui.theme

import androidx.compose.ui.graphics.Color
import com.example.R

enum class CyberSkin(
    val id: String,
    val displayName: String,
    val backgroundResId: Int,
    val primaryColor: Color,
    val secondaryColor: Color,
    val ambientGlowColor: Color,
    val description: String
) {
    JAMAICA(
        "jamaica",
        "Jamaica",
        R.drawable.img_skin_jamaica_1784511085781,
        Color(0xFF39FF14), // Hyper Neon Lime Green
        Color(0xFFFF007F), // Vivid Magenta
        Color(0x5539FF14), // Green Energy Glow
        "Sunny rasta frequencies in a neon cyberpunk magic fantasy forest."
    ),
    MOROCCO(
        "morocco",
        "Morocco",
        R.drawable.img_cyber_alchemy_lab_1783983282176,
        Color(0xFFFFEE00), // Glowing Sun Gold
        Color(0xFFFF5500), // Saturated Cyber Amber
        Color(0x55FFEE00), // Golden Rune Glow
        "Ancient Moroccan alchemy meets a futuristic neon-cyber magic lab."
    ),
    BARCELONA(
        "barcelona",
        "Barcelona",
        R.drawable.img_cyber_tarot_witch_1783983295253,
        Color(0xFFE000FF), // Deep Cyber Magenta
        Color(0xFF00FFFF), // Radiant Electric Cyan
        Color(0x55E000FF), // Neon Witch Glow
        "Cyberpunk social tarot-witch reading. Saturated purple, magenta, and cyan lights."
    ),
    AMSTERDAM(
        "amsterdam",
        "Amsterdam",
        R.drawable.img_skin_amsterdam_1784511096713,
        Color(0xFFFF5500), // Vibrant Dutch Orange
        Color(0xFF00FF66), // Glowing Emerald
        Color(0x55FF5500), // Cyber Orange Glow
        "Digital neon greenhouses and flowing waterways of a fantasy cyber-capital."
    ),
    COFFESHOP(
        "coffeeshop",
        "Coffeeshop",
        R.drawable.img_skin_coffeeshop_1784511108346,
        Color(0xFFFFB900), // Bright Caramel Amber
        Color(0xFF00FF88), // Radioactive Mint Green
        Color(0x55FFB900), // Alchemist Fire Glow
        "A high-energy digital dispensary with glowing potions and emerald flora."
    ),
    BUDS(
        "buds",
        "Buds",
        R.drawable.img_skin_buds_1784511118877,
        Color(0xFF00FFA3), // Radioactive Mint Green
        Color(0xFFFF007F), // Neon Pink
        Color(0x5500FFA3), // Frosty Trichome Glow
        "Vivid fantasy buds sparkling under high-intensity ultraviolet synthwave lasers."
    );

    companion object {
        fun fromId(id: String): CyberSkin = values().find { it.id == id } ?: JAMAICA
    }
}

fun CyberSkin.getLocalizedName(lang: String): String {
    return when (this) {
        CyberSkin.JAMAICA -> when (lang) {
            "ru" -> "Ямайка"
            "es" -> "Jamaica"
            else -> "Jamaica"
        }
        CyberSkin.MOROCCO -> when (lang) {
            "ru" -> "Марокко"
            "es" -> "Marruecos"
            else -> "Morocco"
        }
        CyberSkin.BARCELONA -> when (lang) {
            "ru" -> "Барселона"
            "es" -> "Barcelona"
            else -> "Barcelona"
        }
        CyberSkin.AMSTERDAM -> when (lang) {
            "ru" -> "Амстердам"
            "es" -> "Ámsterdam"
            else -> "Amsterdam"
        }
        CyberSkin.COFFESHOP -> when (lang) {
            "ru" -> "Кофешоп"
            "es" -> "Coffeeshop"
            else -> "Coffeeshop"
        }
        CyberSkin.BUDS -> when (lang) {
            "ru" -> "Шишки"
            "es" -> "Cogollos"
            else -> "Buds"
        }
    }
}

fun CyberSkin.getLocalizedDescription(lang: String): String {
    return when (this) {
        CyberSkin.JAMAICA -> when (lang) {
            "ru" -> "Солнечные вибрации регги. Красно-желто-зеленая раста палитра с золотым свечением."
            "es" -> "Vibraciones soleadas de reggae. Paleta rasta roja, amarilla y verde con brillo dorado."
            else -> "Sunny reggae vibrations. Red, yellow, and green rasta palette with a golden glow."
        }
        CyberSkin.MOROCCO -> when (lang) {
            "ru" -> "Теплый пряный янтарь и традиционный гашиш. Глубокий оранжевый и коричневый колорит."
            "es" -> "Ámbar cálido y especiado. Paleta de tonos naranja profundo y marrón tierra."
            else -> "Warm, spicy amber and traditional resin vibes. Deep orange and earth brown tones."
        }
        CyberSkin.BARCELONA -> when (lang) {
            "ru" -> "Стильный клубный неон ассоциации гров-клубов. Фиолетовый и бирюзовый оттенки."
            "es" -> "Estilo de club social de Barcelona. Tonos morados y turquesas con vibraciones de club."
            else -> "Stylish social grow-club neon. Purple and turquoise tones with premium club vibes."
        }
        CyberSkin.AMSTERDAM -> when (lang) {
            "ru" -> "Каналы и ночные огни Северной Венеции. Глубокий синий и яркий оранжевый неон."
            "es" -> "Canales y luces nocturnas de la capital. Azul profundo y naranja vibrante."
            else -> "Canals and night lights of the capital. Deep canal blue and vibrant orange neon."
        }
        CyberSkin.COFFESHOP -> when (lang) {
            "ru" -> "Уютная атмосфера заведения с запахом свежего кофе. Шоколадный, карамельный и зеленый тона."
            "es" -> "Atmósfera acogedora con aroma a café fresco. Tonos chocolate, caramelo y verde hierba."
            else -> "Cozy cafe atmosphere with fresh herbal aromas. Chocolate, caramel, and herbal green tones."
        }
        CyberSkin.BUDS -> when (lang) {
            "ru" -> "Густые смолистые шишки, покрытые трихомами. Интенсивный липкий зеленый и салатовый неон."
            "es" -> "Flores densas y resinosas cubiertas de tricomas. Verde pegajoso intenso y brillo de resina."
            else -> "Dense resinous buds covered in frosty trichomes. Sticky green colors with lime-green glow."
        }
    }
}
