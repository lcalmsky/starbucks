package io.lcalmsky.starbucks.domain.support;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

public interface Menu {

    String getName();

    int getPrice();

    @RequiredArgsConstructor
    @Getter
    enum ColdBrew implements Menu {
        DOLCE_COLD_BREW("돌체 콜드 브루", 5800),
        COLD_FOAM_COLD_BREW("콜드 폼 콜드 브루", 5800),
        VANILLA_CREAM_COLD_BREW("바닐라 크림 콜드 브루", 5800),
        COLD_BREW("콜드 브루", 5800),
        NITRO_VANILLA_CREAM("나이트로 바닐라 크림", 5800),
        NITRO_CHOCOLAT_CLOUD("나이트로 쇼콜라 클라우드", 5800),
        NITRO_COLD_BREW("나이트로 콜드 브루", 5800);

        private final String name;
        private final int price;

        public int getPriceBySize(Size size) {
            return getPrice() + Optional.ofNullable(size)
                    .map(Enum::ordinal)
                    .map(i -> (i - 1) * 500)
                    .orElse(0);
        }
    }

    @RequiredArgsConstructor
    @Getter
    enum Reserve implements Menu {
        COLD_BREW_MALT("콜드 브루 몰트", 8500),
        COLD_BREW_FLOAT("콜드 브루 플로트", 8000),
        CLASSIC_AFFOGATO("클래식 아포가토", 7000),
        MICROBLEND_NO21("마이크로블렌드 No. 21", 7000),
        RESERVE_NITRO("리저브 나이트로", 7500),
        ICED_MICROBLEND_NO11("마이크로블렌드 No. 11", 6500),
        EL_SALVADOR_LA_PALMA("엘살바도르 라 팔마", 7000),
        COSTARICA_LAS_LOMAS_INITIATIVE("코스타리카 라스 로마스", 6000),
        GUATEMALA_CHIQUIMULA_AND_ZACAPA_VALLEYS("과테말라 치키무라 & 자카파 밸리스", 6000),
        NICARAGUA_DIPILTO_MARACATURA("니카라과 디필토 마라카투라", 7000),
        RWANDA_ABAKUNDAKAWA("르완다 아바쿤다카와(2020)", 6000),
        PAPUA_NEW_GUINEA_KIGABAH_ESTATE("파푸아 뉴기니 키가바 에스테이트", 7000),
        COLOMBIA_EL_TUNEL_VERDE("콜롬비아 엘 터널 베르데", 6000),
        GUATEMALA_ANTIGUA_SANTA_CLARA_ESTATE("과테말라 안티구아 산타 클라라 에스테이트", 6000),
        LAVENDER_CAFE_BREVE("라벤더 카페 브레베", 7000),
        @Deprecated
        SUN_DRIED_ETHIOPIA_YIRGACHEFFE_CHELELEKTU("썬드라이드 에티오피아 예가체프 첼렐렉투", 7000),
        @Deprecated
        CHRISTMAS_2019("크리스마스 2019", 7000),
        @Deprecated
        RWANDA_MUHONDO("르완다 무혼도", 7000);
        private final String name;
        private final int price;
    }

    @RequiredArgsConstructor
    @Getter
    enum Espresso implements Menu {
        VANILLA_FLAT_WHITE("바닐라 플랫 화이트", 5600),
        STARBUCKS_DOLCE_LATTE("스타벅스 돌체 라떼", 5600),
        CAFFE_MOCHA("카페 모카", 5100),
        CAFFE_AMERICANO("카페 아메리카노", 4100),
        CAFFE_LATTE("카페 라떼", 4600),
        CAPPUCCINO("카푸치노", 4600),
        CARAMEL_MACCHIATO("카라멜 마키아또", 5600),
        WHITE_CHOCOLATE_MOCHA("화이트 초콜릿 모카", 5600),
        COFFEE_STARBUCKS_DOUBLE_SHOT("커피 스타벅스 더블 샷", 4800),
        VANILLA_STARBUCKS_DOUBLE_SHOT("바닐라 스타벅스 더블 샷", 4800),
        CARAMEL_STARBUCKS_DOUBLE_SHOT("카라멜 스타벅스 더블 샷", 4800),
        HAZELNUT_STARBUCKS_DOUBLE_SHOUT("헤이즐넛 스타벅스 더블 샷", 4800),
        ESPRESSO("에스프레소", 3600),
        ESPRESSO_MACCHIATO("에스프레소 마끼아또", 3600),
        ESPRESSO_CON_PANNA("에스프레소 콘 파나", 3800);
        private final String name;
        private final int price;
    }

    @RequiredArgsConstructor
    @Getter
    enum DecaffeinatedCoffee implements Menu {
        DECAF_STARBUCKS_DOLCE_LATTE("디카페인 스타벅스 돌체 라떼", 5900),
        DECAF_CARAMEL_MACCHIATO("디카페인 카라멜 마끼아또", 5900),
        DECAF_CAFFE_LATTE("디카페인 카페 라떼", 4900),
        DECAF_CAFFE_AMERICANO("디카페인 카페 아메리카노", 4400),
        HALF_DECAF_STARBUCKS_DOLCE_LATTE("1/2디카페인 스타벅스 돌체라떼", 5900),
        HALF_DECAF_CARAMEL_MACCHIATO("1/2디카페인 카라멜 마키아또", 5900);
        private final String name;
        private final int price;
    }

    @RequiredArgsConstructor
    @Getter
    enum Frappuccino implements Menu {
        SWEET_STRAWBERRY_CHOCOLATE_CREAM_FRAPPUCCINO("스위트 딸기 초콜릿 크림 프라푸치노", 6900),
        ICHEON_NEW_HARVESTED_RICE_COFFEE_FRAPPUCCINO("이천 햅쌀 커피 프라푸치노", 6300),
        JAVA_CHIP_FRAPPUCCINO("자바칩 프라푸치노", 6100),
        WHITE_CHOCOLATE_MOCHA_FRAPPUCCINO("화이트 초콜릿 모카 프라푸치노", 5700),
        CARAMEL_FRAPPUCCINO("카라멜 프라푸치노", 5600),
        MOCHA_FRAPPUCCINO("모카 프라푸치노", 5600),
        ESPRESSO_FRAPPUCCINO("에스프레소 프라푸치노", 5100),
        ICHEON_NEW_HARVESTED_RICE_CREAM_FRAPPUCCINO("이천 햅쌀 크림 프라푸치노", 6300),
        GREEN_TEA_CREAM_FRAPPUCCINO("그린 티 크림 프라푸치노", 6300),
        WHITE_STRAWBERRY_CREAM_FRAPPUCCINO("화이트 딸기 크림 프라푸치노", 6100),
        CHOCOLATE_CREAM_CHIP_FRAPPUCCINO("초콜릿 크림 칩 프라푸치노", 5700),
        CHOCOLATE_CREAM_FRAPPUCCINO("초콜릿 크림 프라푸치노", 5100),
        VANILLA_CREAM_FRAPPUCCINO("바닐라 크림 프라푸치노", 4800);
        private final String name;
        private final int price;
    }

    @RequiredArgsConstructor
    @Getter
    enum Blended implements Menu {
        MANGO_BANANA_BLENDED("망고 바나나 블렌디드", 6300),
        GRAPEFRUIT_SHERBET_BLENDED("자몽 셔벗 블렌디드", 6300),
        STRAWBERRY_YOGURT_BLENDED("딸기 요거트 블렌디드", 6100),
        MANGO_PASSION_FRUIT_BLENDED("망고 패션 후르츠 블렌디드", 5000);
        private final String name;
        private final int price;
    }

    @RequiredArgsConstructor
    @Getter
    enum Fizzio implements Menu {
        PINK_GRAPE_FRUIT_STARBUCKS_FIZZIO("핑크 자몽 피지오", 6300),
        COOL_LIME_STARBUCKS_FIZZIO("쿨 라임 피지오", 5900),
        BLACK_TEA_LEMONADE_STARBUCKS_FIZZIO("블랙 티 레모네이드 피지오", 5400),
        PASSION_TANGO_TEA_LEMONADE_STARBUCKS_FIZZIO("패션 탱고 티 레모네이드 피지오", 5400);
        private final String name;
        private final int price;
    }

    @RequiredArgsConstructor
    @Getter
    enum Tea implements Menu {
        ROMANTIC_STRAWBERRY_TEA("로맨틱 딸기 티", 6900),
        GREEN_TEA_LATTE("그린 티 라떼", 5900),
        LIME_PASSION_TEA("라임 패션 티", 5600),
        GRAPEFRUIT_HONEY_BLACK_TEA("자몽 허니 블랙 티", 5300),
        CHAI_TEA_LATTE("차이 티 라떼", 5100),
        JEJU_ORGANIC_GREEN_TEA("제주 유기 녹차", 4900),
        ENGLISH_BREAKFAST_BREWED_TEA("잉글리쉬 브렉퍼스트 티", 4100),
        HIBISCUS_BLEND_BREWED_TEA("히비스커스 블렌드 티", 4100),
        MINT_BLEND_BREWED_TEA("민트 블렌드 티", 4100),
        @Deprecated
        CHAI_BREWED_TEA("차이 티", 4100),
        @Deprecated
        YOUTHBERRY_BREWED_TEA("유스베리 티", 4100),
        @Deprecated
        CHAMOMILE_BLEND_BREWED_TEA("캐모마일 블렌드 티", 4100);
        private final String name;
        private final int price;
    }

    @RequiredArgsConstructor
    @Getter
    enum Brewed implements Menu {
        brewed_coffee("오늘의 커피", 3800);
        private final String name;
        private final int price;
    }
}