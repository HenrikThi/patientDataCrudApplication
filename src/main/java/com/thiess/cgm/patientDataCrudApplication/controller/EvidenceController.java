package com.thiess.cgm.patientDataCrudApplication.controller;

import com.thiess.cgm.patientDataCrudApplication.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ddi/v1")
public class EvidenceController {
    @CrossOrigin
    @GetMapping(value = "/evidence", produces = "application/json")
    public String getEvidenceJson() {
        return evidenceJson;
    }

    private String evidenceJson = "[\n" +
            "    {\n" +
            "        \"resourceType\": \"Evidence\",\n" +
            "        \"id\": \"risk-factor-age\",\n" +
            "        \"title\": \"Age > 65 years\",\n" +
            "        \"status\": \"draft\",\n" +
            "        \"relatedArtifact\": [\n" +
            "          {\n" +
            "            \"type\": \"citation\",\n" +
            "            \"citation\": \"Chen WC, Chen YH, Hsu PI, Tsay FW, Chan HH, Cheng JS, Lai KH. Gastrointestinal hemorrhage in warfarin anticoagulated patients: incidence, risk factor, management, and outcome. Biomed Res Int. 2014;2014:463767. doi: 10.1155/2014/463767. Epub 2014 May 29. PMID: 24987683; PMCID: PMC4058852.\",\n" +
            "            \"url\": \"https://pubmed.ncbi.nlm.nih.gov/24987683/\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"referentGroup\": {\n" +
            "        },\n" +
            "        \"statistic\": [\n" +
            "          {\n" +
            "            \"quantity\": {\n" +
            "              \"value\": 2.5\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"resourceType\": \"Evidence\",\n" +
            "        \"id\": \"risk-factor-aspirin\",\n" +
            "        \"title\": \"On aspirin\",\n" +
            "        \"status\": \"draft\",\n" +
            "        \"relatedArtifact\": [\n" +
            "          {\n" +
            "            \"type\": \"citation\",\n" +
            "            \"citation\": \"Lanas A, Wu P, Medin J, Mills EJ. Low doses of acetylsalicylic acid increase risk of gastrointestinal bleeding in a meta-analysis. Clin Gastroenterol Hepatol. 2011 Sep;9(9):762-768.e6. doi: 10.1016/j.cgh.2011.05.020. Epub 2011 Jun 6. PMID: 21699808.\",\n" +
            "            \"url\": \"https://pubmed.ncbi.nlm.nih.gov/21699808/\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"referentGroup\": {\n" +
            "        },\n" +
            "        \"statistic\": [\n" +
            "          {\n" +
            "            \"quantity\": {\n" +
            "              \"value\": 1.55\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"resourceType\": \"Evidence\",\n" +
            "        \"id\": \"risk-factor-clopidogrel\",\n" +
            "        \"title\": \"On clopidogrel\",\n" +
            "        \"status\": \"draft\",\n" +
            "        \"relatedArtifact\": [\n" +
            "          {\n" +
            "            \"type\": \"citation\",\n" +
            "            \"citation\": \"Lin CC, Hu HY, Luo JC, Peng YL, Hou MC, Lin HC, Lee FY. Risk factors of gastrointestinal bleeding in clopidogrel users: a nationwide population-based study. Aliment Pharmacol Ther. 2013 Nov;38(9):1119-28. doi: 10.1111/apt.12483. Epub 2013 Sep 15. PMID: 24099473.\",\n" +
            "            \"url\": \"https://pubmed.ncbi.nlm.nih.gov/24099473/\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"referentGroup\": {\n" +
            "        },\n" +
            "        \"statistic\": [\n" +
            "          {\n" +
            "            \"quantity\": {\n" +
            "              \"value\": 3.66\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"resourceType\": \"Evidence\",\n" +
            "        \"id\": \"risk-factor-ssri\",\n" +
            "        \"title\": \"On ssri\",\n" +
            "        \"status\": \"draft\",\n" +
            "        \"relatedArtifact\": [\n" +
            "          {\n" +
            "            \"type\": \"citation\",\n" +
            "            \"citation\": \"Masclee GM, Valkhoff VE, Coloma PM, de Ridder M, Romio S, Schuemie MJ, Herings R, Gini R, Mazzaglia G, Picelli G, Scotti L, Pedersen L, Kuipers EJ, van der Lei J, Sturkenboom MC. Risk of upper gastrointestinal bleeding from different drug combinations. Gastroenterology. 2014 Oct;147(4):784-792.e9; quiz e13-4. doi: 10.1053/j.gastro.2014.06.007. Epub 2014 Jun 14. PMID: 24937265.\",\n" +
            "            \"url\": \"https://pubmed.ncbi.nlm.nih.gov/24937265/\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"referentGroup\": {\n" +
            "        },\n" +
            "        \"statistic\": [\n" +
            "          {\n" +
            "            \"quantity\": {\n" +
            "              \"value\": 2\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"resourceType\": \"Evidence\",\n" +
            "        \"id\": \"risk-factor-corticosteroid\",\n" +
            "        \"title\": \"On corticosteroid\",\n" +
            "        \"status\": \"draft\",\n" +
            "        \"relatedArtifact\": [\n" +
            "          {\n" +
            "            \"type\": \"citation\",\n" +
            "            \"citation\": \"Narum S, Westergren T, Klemp M. Corticosteroids and risk of gastrointestinal bleeding: a systematic review and meta-analysis. BMJ Open. 2014 May 15;4(5):e004587. doi: 10.1136/bmjopen-2013-004587. PMID: 24833682; PMCID: PMC4025450.\",\n" +
            "            \"url\": \"https://pubmed.ncbi.nlm.nih.gov/24833682/\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"referentGroup\": {\n" +
            "        },\n" +
            "        \"statistic\": [\n" +
            "          {\n" +
            "            \"quantity\": {\n" +
            "              \"value\": 1.4\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"resourceType\": \"Evidence\",\n" +
            "        \"id\": \"risk-factor-hx-of-GI-bleeding\",\n" +
            "        \"title\": \"Hx of GI bleeding\",\n" +
            "        \"status\": \"draft\",\n" +
            "        \"relatedArtifact\": [\n" +
            "          {\n" +
            "            \"type\": \"citation\",\n" +
            "            \"citation\": \"Verhamme K, Mosis G, Dieleman J, Stricker B, Sturkenboom M. Spironolactone and risk of upper gastrointestinal events: population based case-control study. BMJ. 2006 Aug 12;333(7563):330. doi: 10.1136/bmj.38883.479549.2F. Epub 2006 Jul 13. PMID: 16840442; PMCID: PMC1539051.\",\n" +
            "            \"url\": \"https://pubmed.ncbi.nlm.nih.gov/16840442/\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"referentGroup\": {\n" +
            "        },\n" +
            "        \"statistic\": [\n" +
            "          {\n" +
            "            \"quantity\": {\n" +
            "              \"value\": 5\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"resourceType\": \"Evidence\",\n" +
            "        \"id\": \"risk-factor-ppi-risk-decrease\",\n" +
            "        \"title\": \"With stomach acid reducer\",\n" +
            "        \"status\": \"draft\",\n" +
            "        \"relatedArtifact\": [\n" +
            "          {\n" +
            "            \"type\": \"citation\",\n" +
            "            \"citation\": \"Ray WA, Chung CP, Murray KT, Smalley WE, Daugherty JR, Dupont WD, Stein CM. Association of Proton Pump Inhibitors With Reduced Risk of Warfarin-Related Serious Upper Gastrointestinal Bleeding. Gastroenterology. 2016 Dec;151(6):1105-1112.e10. doi: 10.1053/j.gastro.2016.08.054. Epub 2016 Sep 14. PMID: 27639805; PMCID: PMC5124401.\",\n" +
            "            \"url\": \"https://pubmed.ncbi.nlm.nih.gov/16840442/\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"referentGroup\": {\n" +
            "        },\n" +
            "        \"statistic\": [\n" +
            "          {\n" +
            "            \"quantity\": {\n" +
            "              \"value\": 0.24\n" +
            "            }\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "]";
}
