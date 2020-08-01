package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.disaster.ashfall.AshFallParser;
import jp.ac.aiit.pbl.disaster.flood.FloodParser;
import jp.ac.aiit.pbl.disaster.hypocenter.HypocenterParser;
import jp.ac.aiit.pbl.disaster.marine.MarineParser;
import jp.ac.aiit.pbl.disaster.nankaitroughearthquake.NankaiTroughEarthquakeParser;
import jp.ac.aiit.pbl.disaster.northwestpacifictsunami.NorthwestPacificTsunamiParser;
import jp.ac.aiit.pbl.disaster.seismicIntensity.SeismicIntensityParser;
import jp.ac.aiit.pbl.disaster.tsunami.TsunamiParser;
import jp.ac.aiit.pbl.disaster.typhoon.TyphoonParser;
import jp.ac.aiit.pbl.disaster.volcano.VolcanoParser;

/**
 * This class is
 */
public class DisasterParserFactory {

    public DisasterParser create(String qzMessage){
        PrefixParser parser = new PrefixParser();
        Prefix prefix = parser.parse(qzMessage);
        if(prefix.getDisasterCategory().equals(DisasterCategory.AshFall)){
            return new AshFallParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.Flood)){
            return new FloodParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.Hypocenter)){
            return new HypocenterParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.Marine)){
            return new MarineParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.NankaiTroughEarthquake)){
            return new NankaiTroughEarthquakeParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.NorthwestPacificTsunami)){
            return new NorthwestPacificTsunamiParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.SeismicIntensity)){
            return new SeismicIntensityParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.Tsunami)){
            return new TsunamiParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.Typhoon)){
            return new TyphoonParser();
        }else if(prefix.getDisasterCategory().equals(DisasterCategory.Volcano)){
            return new VolcanoParser();
        }else if (prefix.getDisasterCategory().equals(DisasterCategory.Weather)){
            //return new WeatherParser();
        }

        return null;
    }
}
