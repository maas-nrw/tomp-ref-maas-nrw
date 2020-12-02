package io.swagger.api;

import io.swagger.model.Asset;
import io.swagger.model.Error;
import io.swagger.model.Leg;
import io.swagger.model.LegEvent;
import io.swagger.model.LegProgress;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-30T14:11:18.823Z[GMT]")
@Controller
public class LegsApiController implements LegsApi {

    private static final Logger log = LoggerFactory.getLogger(LegsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LegsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Asset>> legsIdAvailableAssetsGet(@ApiParam(value = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage
,@ApiParam(value = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true) @RequestHeader(value="Api", required=true) String api
,@ApiParam(value = "Version of the API." ,required=true) @RequestHeader(value="Api-Version", required=true) String apiVersion
,@ApiParam(value = "Leg identifier",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Asset>>(objectMapper.readValue("[ {\n  \"overriddenProperties\" : {\n    \"pets\" : true,\n    \"airConditioning\" : true,\n    \"other\" : \"other\",\n    \"fuel\" : \"NONE\",\n    \"travelAbroad\" : true,\n    \"energyLabel\" : \"A\",\n    \"winterTires\" : true,\n    \"undergroundParking\" : true,\n    \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n    \"smoking\" : true,\n    \"towingHook\" : true,\n    \"model\" : \"model\",\n    \"gearbox\" : \"MANUAL\",\n    \"cargo\" : \"cargo\",\n    \"brand\" : \"brand\",\n    \"gears\" : 1,\n    \"cabrio\" : true,\n    \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n    \"buildingYear\" : 6,\n    \"stateOfCharge\" : 56,\n    \"co2PerKm\" : 0.8008281904610115,\n    \"propulsion\" : \"MUSCLE\",\n    \"infantSeat\" : true,\n    \"persons\" : 1,\n    \"colour\" : \"colour\",\n    \"easyAccessibility\" : \"LIFT\",\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"location\" : {\n      \"name\" : \"name\",\n      \"coordinates\" : {\n        \"lng\" : 6.169639,\n        \"lat\" : 52.253279\n      },\n      \"physicalAddress\" : {\n        \"areaReference\" : \"Smallcity, Pinetree county\",\n        \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n        \"postalCode\" : \"postalCode\"\n      },\n      \"stopReference\" : [ {\n        \"country\" : \"NL\",\n        \"id\" : \"id\",\n        \"type\" : \"GTFS_STOP_ID\"\n      }, {\n        \"country\" : \"NL\",\n        \"id\" : \"id\",\n        \"type\" : \"GTFS_STOP_ID\"\n      } ],\n      \"stationId\" : \"stationId\",\n      \"extraInfo\" : \"\"\n    }\n  },\n  \"isReserved\" : true,\n  \"isReservedFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"id\",\n  \"isDisabled\" : true,\n  \"isReservedTo\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"overriddenProperties\" : {\n    \"pets\" : true,\n    \"airConditioning\" : true,\n    \"other\" : \"other\",\n    \"fuel\" : \"NONE\",\n    \"travelAbroad\" : true,\n    \"energyLabel\" : \"A\",\n    \"winterTires\" : true,\n    \"undergroundParking\" : true,\n    \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n    \"smoking\" : true,\n    \"towingHook\" : true,\n    \"model\" : \"model\",\n    \"gearbox\" : \"MANUAL\",\n    \"cargo\" : \"cargo\",\n    \"brand\" : \"brand\",\n    \"gears\" : 1,\n    \"cabrio\" : true,\n    \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n    \"buildingYear\" : 6,\n    \"stateOfCharge\" : 56,\n    \"co2PerKm\" : 0.8008281904610115,\n    \"propulsion\" : \"MUSCLE\",\n    \"infantSeat\" : true,\n    \"persons\" : 1,\n    \"colour\" : \"colour\",\n    \"easyAccessibility\" : \"LIFT\",\n    \"meta\" : \"\",\n    \"name\" : \"name\",\n    \"location\" : {\n      \"name\" : \"name\",\n      \"coordinates\" : {\n        \"lng\" : 6.169639,\n        \"lat\" : 52.253279\n      },\n      \"physicalAddress\" : {\n        \"areaReference\" : \"Smallcity, Pinetree county\",\n        \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n        \"postalCode\" : \"postalCode\"\n      },\n      \"stopReference\" : [ {\n        \"country\" : \"NL\",\n        \"id\" : \"id\",\n        \"type\" : \"GTFS_STOP_ID\"\n      }, {\n        \"country\" : \"NL\",\n        \"id\" : \"id\",\n        \"type\" : \"GTFS_STOP_ID\"\n      } ],\n      \"stationId\" : \"stationId\",\n      \"extraInfo\" : \"\"\n    }\n  },\n  \"isReserved\" : true,\n  \"isReservedFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"id\",\n  \"isDisabled\" : true,\n  \"isReservedTo\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Asset>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Asset>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Leg> legsIdEventsPost(@ApiParam(value = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage
,@ApiParam(value = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true) @RequestHeader(value="Api", required=true) String api
,@ApiParam(value = "Version of the API." ,required=true) @RequestHeader(value="Api-Version", required=true) String apiVersion
,@ApiParam(value = "Leg identifier",required=true) @PathVariable("id") String id
,@ApiParam(value = ""  )  @Valid @RequestBody LegEvent body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Leg>(objectMapper.readValue("{\n  \"departureTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"progressGeometry\" : [ [ 6.169639, 52.253279 ], [ 6.05623, 52.63473 ] ],\n  \"distance\" : 7250,\n  \"ticket\" : {\n    \"tokenData\" : \"\",\n    \"validUntil\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"tokenType\" : \"QR-code\"\n  },\n  \"suboperator\" : {\n    \"maasId\" : \"maasId\",\n    \"contact\" : \"contact\",\n    \"name\" : \"name\",\n    \"description\" : \"description\"\n  },\n  \"departureDelay\" : 11112,\n  \"assetType\" : {\n    \"assets\" : [ {\n      \"overriddenProperties\" : {\n        \"pets\" : true,\n        \"airConditioning\" : true,\n        \"other\" : \"other\",\n        \"fuel\" : \"NONE\",\n        \"travelAbroad\" : true,\n        \"energyLabel\" : \"A\",\n        \"winterTires\" : true,\n        \"undergroundParking\" : true,\n        \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n        \"smoking\" : true,\n        \"towingHook\" : true,\n        \"model\" : \"model\",\n        \"gearbox\" : \"MANUAL\",\n        \"cargo\" : \"cargo\",\n        \"brand\" : \"brand\",\n        \"gears\" : 1,\n        \"cabrio\" : true,\n        \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n        \"buildingYear\" : 6,\n        \"stateOfCharge\" : 56,\n        \"co2PerKm\" : 0.8008281904610115,\n        \"propulsion\" : \"MUSCLE\",\n        \"infantSeat\" : true,\n        \"persons\" : 1,\n        \"colour\" : \"colour\",\n        \"easyAccessibility\" : \"LIFT\",\n        \"meta\" : \"\",\n        \"name\" : \"name\",\n        \"location\" : {\n          \"name\" : \"name\",\n          \"coordinates\" : {\n            \"lng\" : 6.169639,\n            \"lat\" : 52.253279\n          },\n          \"physicalAddress\" : {\n            \"areaReference\" : \"Smallcity, Pinetree county\",\n            \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n            \"postalCode\" : \"postalCode\"\n          },\n          \"stopReference\" : [ {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          }, {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          } ],\n          \"stationId\" : \"stationId\",\n          \"extraInfo\" : \"\"\n        }\n      },\n      \"isReserved\" : true,\n      \"isReservedFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"id\" : \"id\",\n      \"isDisabled\" : true,\n      \"isReservedTo\" : \"2000-01-23T04:56:07.000+00:00\"\n    }, {\n      \"overriddenProperties\" : {\n        \"pets\" : true,\n        \"airConditioning\" : true,\n        \"other\" : \"other\",\n        \"fuel\" : \"NONE\",\n        \"travelAbroad\" : true,\n        \"energyLabel\" : \"A\",\n        \"winterTires\" : true,\n        \"undergroundParking\" : true,\n        \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n        \"smoking\" : true,\n        \"towingHook\" : true,\n        \"model\" : \"model\",\n        \"gearbox\" : \"MANUAL\",\n        \"cargo\" : \"cargo\",\n        \"brand\" : \"brand\",\n        \"gears\" : 1,\n        \"cabrio\" : true,\n        \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n        \"buildingYear\" : 6,\n        \"stateOfCharge\" : 56,\n        \"co2PerKm\" : 0.8008281904610115,\n        \"propulsion\" : \"MUSCLE\",\n        \"infantSeat\" : true,\n        \"persons\" : 1,\n        \"colour\" : \"colour\",\n        \"easyAccessibility\" : \"LIFT\",\n        \"meta\" : \"\",\n        \"name\" : \"name\",\n        \"location\" : {\n          \"name\" : \"name\",\n          \"coordinates\" : {\n            \"lng\" : 6.169639,\n            \"lat\" : 52.253279\n          },\n          \"physicalAddress\" : {\n            \"areaReference\" : \"Smallcity, Pinetree county\",\n            \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n            \"postalCode\" : \"postalCode\"\n          },\n          \"stopReference\" : [ {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          }, {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          } ],\n          \"stationId\" : \"stationId\",\n          \"extraInfo\" : \"\"\n        }\n      },\n      \"isReserved\" : true,\n      \"isReservedFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"id\" : \"id\",\n      \"isDisabled\" : true,\n      \"isReservedTo\" : \"2000-01-23T04:56:07.000+00:00\"\n    } ],\n    \"nrAvailable\" : 0,\n    \"id\" : \"id\",\n    \"assetClass\" : \"AIR\",\n    \"assetSubClass\" : \"assetSubClass\",\n    \"stationId\" : \"stationId\",\n    \"sharedProperties\" : {\n      \"pets\" : true,\n      \"airConditioning\" : true,\n      \"other\" : \"other\",\n      \"fuel\" : \"NONE\",\n      \"travelAbroad\" : true,\n      \"energyLabel\" : \"A\",\n      \"winterTires\" : true,\n      \"undergroundParking\" : true,\n      \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n      \"smoking\" : true,\n      \"towingHook\" : true,\n      \"model\" : \"model\",\n      \"gearbox\" : \"MANUAL\",\n      \"cargo\" : \"cargo\",\n      \"brand\" : \"brand\",\n      \"gears\" : 1,\n      \"cabrio\" : true,\n      \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n      \"buildingYear\" : 6,\n      \"stateOfCharge\" : 56,\n      \"co2PerKm\" : 0.8008281904610115,\n      \"propulsion\" : \"MUSCLE\",\n      \"infantSeat\" : true,\n      \"persons\" : 1,\n      \"colour\" : \"colour\",\n      \"easyAccessibility\" : \"LIFT\",\n      \"meta\" : \"\",\n      \"name\" : \"name\",\n      \"location\" : {\n        \"name\" : \"name\",\n        \"coordinates\" : {\n          \"lng\" : 6.169639,\n          \"lat\" : 52.253279\n        },\n        \"physicalAddress\" : {\n          \"areaReference\" : \"Smallcity, Pinetree county\",\n          \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n          \"postalCode\" : \"postalCode\"\n        },\n        \"stopReference\" : [ {\n          \"country\" : \"NL\",\n          \"id\" : \"id\",\n          \"type\" : \"GTFS_STOP_ID\"\n        }, {\n          \"country\" : \"NL\",\n          \"id\" : \"id\",\n          \"type\" : \"GTFS_STOP_ID\"\n        } ],\n        \"stationId\" : \"stationId\",\n        \"extraInfo\" : \"\"\n      }\n    }\n  },\n  \"arrivalTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"from\" : {\n    \"name\" : \"name\",\n    \"coordinates\" : {\n      \"lng\" : 6.169639,\n      \"lat\" : 52.253279\n    },\n    \"physicalAddress\" : {\n      \"areaReference\" : \"Smallcity, Pinetree county\",\n      \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n      \"postalCode\" : \"postalCode\"\n    },\n    \"stopReference\" : [ {\n      \"country\" : \"NL\",\n      \"id\" : \"id\",\n      \"type\" : \"GTFS_STOP_ID\"\n    }, {\n      \"country\" : \"NL\",\n      \"id\" : \"id\",\n      \"type\" : \"GTFS_STOP_ID\"\n    } ],\n    \"stationId\" : \"stationId\",\n    \"extraInfo\" : \"\"\n  },\n  \"id\" : \"id\",\n  \"state\" : \"NOT_STARTED\",\n  \"conditions\" : [ {\n    \"conditionType\" : \"conditionType\",\n    \"id\" : \"deposit50eu\"\n  }, {\n    \"conditionType\" : \"conditionType\",\n    \"id\" : \"deposit50eu\"\n  } ],\n  \"pricing\" : {\n    \"estimated\" : true,\n    \"parts\" : [ {\n      \"amount\" : 9.96,\n      \"currencyCode\" : \"EUR\",\n      \"taxRate\" : 21,\n      \"type\" : \"FLEX\",\n      \"unitType\" : \"HOUR\",\n      \"units\" : 1\n    }, {\n      \"amount\" : 9.96,\n      \"currencyCode\" : \"EUR\",\n      \"taxRate\" : 21,\n      \"type\" : \"FLEX\",\n      \"unitType\" : \"HOUR\",\n      \"units\" : 1\n    } ],\n    \"description\" : \"description\",\n    \"class\" : \"class\"\n  }\n}", Leg.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Leg>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Leg>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Leg> legsIdGet(@ApiParam(value = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage
,@ApiParam(value = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true) @RequestHeader(value="Api", required=true) String api
,@ApiParam(value = "Version of the API." ,required=true) @RequestHeader(value="Api-Version", required=true) String apiVersion
,@ApiParam(value = "Leg identifier",required=true) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Leg>(objectMapper.readValue("{\n  \"departureTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"progressGeometry\" : [ [ 6.169639, 52.253279 ], [ 6.05623, 52.63473 ] ],\n  \"distance\" : 7250,\n  \"ticket\" : {\n    \"tokenData\" : \"\",\n    \"validUntil\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"tokenType\" : \"QR-code\"\n  },\n  \"suboperator\" : {\n    \"maasId\" : \"maasId\",\n    \"contact\" : \"contact\",\n    \"name\" : \"name\",\n    \"description\" : \"description\"\n  },\n  \"departureDelay\" : 11112,\n  \"assetType\" : {\n    \"assets\" : [ {\n      \"overriddenProperties\" : {\n        \"pets\" : true,\n        \"airConditioning\" : true,\n        \"other\" : \"other\",\n        \"fuel\" : \"NONE\",\n        \"travelAbroad\" : true,\n        \"energyLabel\" : \"A\",\n        \"winterTires\" : true,\n        \"undergroundParking\" : true,\n        \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n        \"smoking\" : true,\n        \"towingHook\" : true,\n        \"model\" : \"model\",\n        \"gearbox\" : \"MANUAL\",\n        \"cargo\" : \"cargo\",\n        \"brand\" : \"brand\",\n        \"gears\" : 1,\n        \"cabrio\" : true,\n        \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n        \"buildingYear\" : 6,\n        \"stateOfCharge\" : 56,\n        \"co2PerKm\" : 0.8008281904610115,\n        \"propulsion\" : \"MUSCLE\",\n        \"infantSeat\" : true,\n        \"persons\" : 1,\n        \"colour\" : \"colour\",\n        \"easyAccessibility\" : \"LIFT\",\n        \"meta\" : \"\",\n        \"name\" : \"name\",\n        \"location\" : {\n          \"name\" : \"name\",\n          \"coordinates\" : {\n            \"lng\" : 6.169639,\n            \"lat\" : 52.253279\n          },\n          \"physicalAddress\" : {\n            \"areaReference\" : \"Smallcity, Pinetree county\",\n            \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n            \"postalCode\" : \"postalCode\"\n          },\n          \"stopReference\" : [ {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          }, {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          } ],\n          \"stationId\" : \"stationId\",\n          \"extraInfo\" : \"\"\n        }\n      },\n      \"isReserved\" : true,\n      \"isReservedFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"id\" : \"id\",\n      \"isDisabled\" : true,\n      \"isReservedTo\" : \"2000-01-23T04:56:07.000+00:00\"\n    }, {\n      \"overriddenProperties\" : {\n        \"pets\" : true,\n        \"airConditioning\" : true,\n        \"other\" : \"other\",\n        \"fuel\" : \"NONE\",\n        \"travelAbroad\" : true,\n        \"energyLabel\" : \"A\",\n        \"winterTires\" : true,\n        \"undergroundParking\" : true,\n        \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n        \"smoking\" : true,\n        \"towingHook\" : true,\n        \"model\" : \"model\",\n        \"gearbox\" : \"MANUAL\",\n        \"cargo\" : \"cargo\",\n        \"brand\" : \"brand\",\n        \"gears\" : 1,\n        \"cabrio\" : true,\n        \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n        \"buildingYear\" : 6,\n        \"stateOfCharge\" : 56,\n        \"co2PerKm\" : 0.8008281904610115,\n        \"propulsion\" : \"MUSCLE\",\n        \"infantSeat\" : true,\n        \"persons\" : 1,\n        \"colour\" : \"colour\",\n        \"easyAccessibility\" : \"LIFT\",\n        \"meta\" : \"\",\n        \"name\" : \"name\",\n        \"location\" : {\n          \"name\" : \"name\",\n          \"coordinates\" : {\n            \"lng\" : 6.169639,\n            \"lat\" : 52.253279\n          },\n          \"physicalAddress\" : {\n            \"areaReference\" : \"Smallcity, Pinetree county\",\n            \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n            \"postalCode\" : \"postalCode\"\n          },\n          \"stopReference\" : [ {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          }, {\n            \"country\" : \"NL\",\n            \"id\" : \"id\",\n            \"type\" : \"GTFS_STOP_ID\"\n          } ],\n          \"stationId\" : \"stationId\",\n          \"extraInfo\" : \"\"\n        }\n      },\n      \"isReserved\" : true,\n      \"isReservedFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"id\" : \"id\",\n      \"isDisabled\" : true,\n      \"isReservedTo\" : \"2000-01-23T04:56:07.000+00:00\"\n    } ],\n    \"nrAvailable\" : 0,\n    \"id\" : \"id\",\n    \"assetClass\" : \"AIR\",\n    \"assetSubClass\" : \"assetSubClass\",\n    \"stationId\" : \"stationId\",\n    \"sharedProperties\" : {\n      \"pets\" : true,\n      \"airConditioning\" : true,\n      \"other\" : \"other\",\n      \"fuel\" : \"NONE\",\n      \"travelAbroad\" : true,\n      \"energyLabel\" : \"A\",\n      \"winterTires\" : true,\n      \"undergroundParking\" : true,\n      \"rentalUrl\" : \"https://www.rentmyfreebike.com/rental\",\n      \"smoking\" : true,\n      \"towingHook\" : true,\n      \"model\" : \"model\",\n      \"gearbox\" : \"MANUAL\",\n      \"cargo\" : \"cargo\",\n      \"brand\" : \"brand\",\n      \"gears\" : 1,\n      \"cabrio\" : true,\n      \"image\" : \"https://files.fietsersbond.nl/app/uploads/2014/10/30151126/ST2_Men_Side_CityKit-Stromer.jpg\",\n      \"buildingYear\" : 6,\n      \"stateOfCharge\" : 56,\n      \"co2PerKm\" : 0.8008281904610115,\n      \"propulsion\" : \"MUSCLE\",\n      \"infantSeat\" : true,\n      \"persons\" : 1,\n      \"colour\" : \"colour\",\n      \"easyAccessibility\" : \"LIFT\",\n      \"meta\" : \"\",\n      \"name\" : \"name\",\n      \"location\" : {\n        \"name\" : \"name\",\n        \"coordinates\" : {\n          \"lng\" : 6.169639,\n          \"lat\" : 52.253279\n        },\n        \"physicalAddress\" : {\n          \"areaReference\" : \"Smallcity, Pinetree county\",\n          \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n          \"postalCode\" : \"postalCode\"\n        },\n        \"stopReference\" : [ {\n          \"country\" : \"NL\",\n          \"id\" : \"id\",\n          \"type\" : \"GTFS_STOP_ID\"\n        }, {\n          \"country\" : \"NL\",\n          \"id\" : \"id\",\n          \"type\" : \"GTFS_STOP_ID\"\n        } ],\n        \"stationId\" : \"stationId\",\n        \"extraInfo\" : \"\"\n      }\n    }\n  },\n  \"arrivalTime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"from\" : {\n    \"name\" : \"name\",\n    \"coordinates\" : {\n      \"lng\" : 6.169639,\n      \"lat\" : 52.253279\n    },\n    \"physicalAddress\" : {\n      \"areaReference\" : \"Smallcity, Pinetree county\",\n      \"streetAddress\" : \"example street 18, 2nd floor, 18-B33\",\n      \"postalCode\" : \"postalCode\"\n    },\n    \"stopReference\" : [ {\n      \"country\" : \"NL\",\n      \"id\" : \"id\",\n      \"type\" : \"GTFS_STOP_ID\"\n    }, {\n      \"country\" : \"NL\",\n      \"id\" : \"id\",\n      \"type\" : \"GTFS_STOP_ID\"\n    } ],\n    \"stationId\" : \"stationId\",\n    \"extraInfo\" : \"\"\n  },\n  \"id\" : \"id\",\n  \"state\" : \"NOT_STARTED\",\n  \"conditions\" : [ {\n    \"conditionType\" : \"conditionType\",\n    \"id\" : \"deposit50eu\"\n  }, {\n    \"conditionType\" : \"conditionType\",\n    \"id\" : \"deposit50eu\"\n  } ],\n  \"pricing\" : {\n    \"estimated\" : true,\n    \"parts\" : [ {\n      \"amount\" : 9.96,\n      \"currencyCode\" : \"EUR\",\n      \"taxRate\" : 21,\n      \"type\" : \"FLEX\",\n      \"unitType\" : \"HOUR\",\n      \"units\" : 1\n    }, {\n      \"amount\" : 9.96,\n      \"currencyCode\" : \"EUR\",\n      \"taxRate\" : 21,\n      \"type\" : \"FLEX\",\n      \"unitType\" : \"HOUR\",\n      \"units\" : 1\n    } ],\n    \"description\" : \"description\",\n    \"class\" : \"class\"\n  }\n}", Leg.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Leg>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Leg>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LegProgress> legsIdProgressGet(@ApiParam(value = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage
,@ApiParam(value = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true) @RequestHeader(value="Api", required=true) String api
,@ApiParam(value = "Version of the API." ,required=true) @RequestHeader(value="Api-Version", required=true) String apiVersion
,@ApiParam(value = "Leg identifier",required=true) @PathVariable("id") String id
,@ApiParam(value = "Specifies if only the location should be returned", defaultValue = "false") @Valid @RequestParam(value = "location-only", required = false, defaultValue="false") Boolean locationOnly
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LegProgress>(objectMapper.readValue("{\n  \"duration\" : 11112,\n  \"distance\" : 7250,\n  \"coordinates\" : {\n    \"lng\" : 6.169639,\n    \"lat\" : 52.253279\n  }\n}", LegProgress.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LegProgress>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LegProgress>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> legsIdProgressPost(@ApiParam(value = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage
,@ApiParam(value = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true) @RequestHeader(value="Api", required=true) String api
,@ApiParam(value = "Version of the API." ,required=true) @RequestHeader(value="Api-Version", required=true) String apiVersion
,@ApiParam(value = "Leg identifier",required=true) @PathVariable("id") String id
,@ApiParam(value = ""  )  @Valid @RequestBody LegProgress body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> legsIdPut(@ApiParam(value = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage
,@ApiParam(value = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true) @RequestHeader(value="Api", required=true) String api
,@ApiParam(value = "Version of the API." ,required=true) @RequestHeader(value="Api-Version", required=true) String apiVersion
,@ApiParam(value = "Leg identifier",required=true) @PathVariable("id") String id
,@ApiParam(value = "changed leg (e.g. with different duration or destination)" ,required=true )  @Valid @RequestBody Leg body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
