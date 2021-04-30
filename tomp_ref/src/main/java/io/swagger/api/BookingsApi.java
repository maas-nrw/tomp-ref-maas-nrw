/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Booking;
import io.swagger.model.BookingOperation;
import io.swagger.model.BookingRequest;
import io.swagger.model.BookingState;
import io.swagger.model.Error;
import io.swagger.model.Notification;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-26T08:47:05.979Z[GMT]")
@Validated
public interface BookingsApi {

    @Operation(summary = "", description = "Optional - Returns bookings that has been created earlier, selected on state.", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "booking [optional]", "TO" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The bookings matching the query", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Booking.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/bookings",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Booking>> bookingsGet(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "state", required = true) BookingState state, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo);


    @Operation(summary = "", description = "This endpoint **must** be used to alter the state of a booking:<br>- The operation 'CANCEL' Cancels the booking (see <4> in the process flow - booking), <br>- the operation 'EXPIRE' informs that the booking-option is expired (see <5> in the process flow - booking) and <br>- the 'COMMIT' actually makes this booking option a real confirmed booking. (see also (3.2) in process flow - booking). This event should also be used to commit in the 'postponed-commit' scenario.<br> - 'DENY' tells the MP that the leg is cancelled in the post-commit scenario. <p> `CANCEL` - Cancels a confirmed booking. Cancelling twice should still return 204. <br> `EXPIRE` - Typically for sending back a signal from TO to MP to tell the pending state is expired. Expiring twice should return 204. Expiring a booking in a non-pending state will result in 403. <BR> `COMMIT` - Turns the booking in a confirmed state, after all legs are in state pending. Committing twice will result in 204. If the booking is in state CANCELLED or EXPIRED, a commit will result a 403. <BR> `DENY` - Used for the 'postponed-commit' scenario. Whenever a TO cannot give guarantees directly to fulfil a booking, it can return a 'COMMIT', but the state of the booking object should be 'POSTPONED-COMMIT'. In the conditions returned in the planning phase is stated until when this phase can be. After this time it will become expired. Otherwise, it can be committed when the leg is confirmed or denied (using this event).", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "booking", "MP", "TO" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The modified booking", content = @Content(schema = @Schema(implementation = Booking.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent.") })
    @RequestMapping(value = "/bookings/{id}/events",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Booking> bookingsIdEventsPost(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.PATH, description = "Leg identifier", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody BookingOperation body);


    @Operation(summary = "", description = "Returns the booking. See (3.5.2) in the process flow - booking. In the 'meta'-field the digital tickes can be returned (see (3.3) in the process flow - booking)", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "booking", "TO" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The booking was found", content = @Content(schema = @Schema(implementation = Booking.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent.") })
    @RequestMapping(value = "/bookings/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Booking> bookingsIdGet(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.PATH, description = "Booking identifier", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo);


    @Operation(summary = "", description = "retrieves all notifications concerning events related to this booking.", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "general", "TO" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The bookings matching the query", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Notification.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent.") })
    @RequestMapping(value = "/bookings/{id}/notifications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Notification>> bookingsIdNotificationsGet(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.PATH, description = "Booking identifier", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo);


    @Operation(summary = "", description = "notification between MaaS provider and Transport operator in case of user no-show or if specific asset is not available or some other event occurs not covered by other API calls.", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "general", "TO", "MP" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request was successful, no content to return."),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent.") })
    @RequestMapping(value = "/bookings/{id}/notifications",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> bookingsIdNotificationsPost(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.PATH, description = "Booking identifier", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Notification body);


    @Operation(summary = "", description = "Optional - This endpoint should be used to adjust the parameters of the booking. Changes not acceptable to the TO should return 400. If a booking is started and can no longer be adjusted the TO should return 403. The state of the booking should **never** be adjusted using this method. Use /bookings/{id}/events for that. See also (7.2) in the flow diagram - booking.", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "booking [optional]", "TO" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The booking was modified", content = @Content(schema = @Schema(implementation = Booking.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "409", description = "The request will not be fulfilled. The request itself is legal, but the content conflicts with the server and might be stale. The user might try again after looking up the current state of the resource."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent.") })
    @RequestMapping(value = "/bookings/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Booking> bookingsIdPut(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.PATH, description = "Booking identifier", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "changed booking", required=true, schema=@Schema()) @Valid @RequestBody Booking body, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo);


    @Operation(summary = "", description = "Optional - subscribe to a specific booking (=leg & (type of) asset). This is an optional endpoint", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "booking [optional]", "TO", "MP" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request was successful, no content to return."),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent."),
        
        @ApiResponse(responseCode = "200", description = "Unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/bookings/{id}/subscription",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> bookingsIdSubscriptionDelete(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.PATH, description = "Booking identifier", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo);


    @Operation(summary = "", description = "Optional - subscribe to a specific booking (=leg & (type of) asset). This is an optional endpoint. This endpoint facilitates notifications in all the phases. (see (7.1) in the flow chart - execution)", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "booking [optional]", "TO", "MP" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request was successful, no content to return."),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent.") })
    @RequestMapping(value = "/bookings/{id}/subscription",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> bookingsIdSubscriptionPost(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.PATH, description = "Booking identifier", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo);


    @Operation(summary = "", description = "Creates a new `Booking` for the TO in **Pending** state. The ID of the posted booking should be the ID provided in the previous step (planning). <p>The Booking may be modified in the response, e.g. location being adjusted for a more suitable pick-up location. In addition, the service may contain a **meta** attribute for arbitrary TO metadata that the TO needs later, and **token** attribute depicting how long the current state is valid. <p> see (3.2) in the process flow - booking. <p>The MP can implement this endpoint when it allows direct booking by TOs. The specific TO can book an asset from themselves to get it registrated and handled (financially) by the MP.", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "OAuth", scopes = {
                    }),
@SecurityRequirement(name = "OpenId")    }, tags={ "booking", "TO", "MP" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "A new booking was succesfully created, status pending", content = @Content(schema = @Schema(implementation = Booking.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request. See https://github.com/TOMP-WG/TOMP-API/wiki/Error-handling-in-TOMP for further explanation of error code.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "401", description = "Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "403", description = "The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.", content = @Content(schema = @Schema(implementation = Error.class))),
        
        @ApiResponse(responseCode = "404", description = "The requested resources does not exist or the requester is not authorized to see it or know it exists."),
        
        @ApiResponse(responseCode = "409", description = "The request will not be fulfilled. The request itself is legal, but the content conflicts with the server and might be stale. The user might try again after looking up the current state of the resource."),
        
        @ApiResponse(responseCode = "410", description = "The requested resource is no longer available. This is permanent.") })
    @RequestMapping(value = "/bookings",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Booking> bookingsPost(@Parameter(in = ParameterIn.HEADER, description = "A list of the languages/localizations the user would like to see the results in. For user privacy and ease of use on the TO side, this list should be kept as short as possible, ideally just one language tag from the list in operator/information" ,required=true,schema=@Schema()) @RequestHeader(value="Accept-Language", required=true) String acceptLanguage, @Parameter(in = ParameterIn.HEADER, description = "API description, can be TOMP or maybe other (specific/derived) API definitions" ,required=true,schema=@Schema()) @RequestHeader(value="Api", required=true) String api, @Parameter(in = ParameterIn.HEADER, description = "Version of the API." ,required=true,schema=@Schema()) @RequestHeader(value="Api-Version", required=true) String apiVersion, @Parameter(in = ParameterIn.HEADER, description = "The ID of the sending maas operator" ,required=true,schema=@Schema()) @RequestHeader(value="maas-id", required=true) String maasId, @Parameter(in = ParameterIn.DEFAULT, description = "One of available booking options, returned by /plannings, with an ID.", required=true, schema=@Schema()) @Valid @RequestBody BookingRequest body, @Parameter(in = ParameterIn.HEADER, description = "The ID of the maas operator that has to receive this message" ,schema=@Schema()) @RequestHeader(value="addressed-to", required=false) String addressedTo);

}

