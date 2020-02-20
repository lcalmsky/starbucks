package io.lcalmsky.starbucks.domain.support;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

public enum Menu {
    ;

    @RequiredArgsConstructor
    @Getter
    public enum ColdBrew {
        DOLCE_COLD_BREW("돌체 콜드 브루", 5800),
        COLD_FOAM_COLD_BREW("콜드 폼 콜드 브루", 5800),
        VANILLA_CREAM_COLD_BREW("바닐라 크림 콜드 브루", 5800),
        COLD_BREW("콜드 브루", 5800),
        NITRO_VANILLA_CREAM("나이트로 바닐라 크림", 5800),
        NITRO_CHOCOLAT_CLOUD("나이트로 쇼콜라 클라우드", 5800),
        NITRO_COLD_BREW("나이트로 콜드 브루", 5800),
        ;

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
    public enum Reserve {
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
}
