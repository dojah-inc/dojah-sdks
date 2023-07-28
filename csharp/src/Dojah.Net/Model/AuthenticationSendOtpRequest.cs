/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// AuthenticationSendOtpRequest
    /// </summary>
    [DataContract(Name = "AuthenticationSendOtpRequest")]
    public partial class AuthenticationSendOtpRequest : IEquatable<AuthenticationSendOtpRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AuthenticationSendOtpRequest" /> class.
        /// </summary>
        /// <param name="destination">destination.</param>
        /// <param name="length">length.</param>
        /// <param name="channel">channel.</param>
        /// <param name="senderId">senderId.</param>
        /// <param name="priority">priority.</param>
        public AuthenticationSendOtpRequest(string destination = default(string), decimal length = default(decimal), string channel = default(string), string senderId = default(string), bool priority = default(bool))
        {
            this.Destination = destination;
            this.Length = length;
            this.Channel = channel;
            this.SenderId = senderId;
            this.Priority = priority;
        }

        /// <summary>
        /// Gets or Sets Destination
        /// </summary>
        [DataMember(Name = "destination", EmitDefaultValue = false)]
        public string Destination { get; set; }

        /// <summary>
        /// Gets or Sets Length
        /// </summary>
        [DataMember(Name = "length", EmitDefaultValue = false)]
        public decimal Length { get; set; }

        /// <summary>
        /// Gets or Sets Channel
        /// </summary>
        [DataMember(Name = "channel", EmitDefaultValue = false)]
        public string Channel { get; set; }

        /// <summary>
        /// Gets or Sets SenderId
        /// </summary>
        [DataMember(Name = "sender_id", EmitDefaultValue = false)]
        public string SenderId { get; set; }

        /// <summary>
        /// Gets or Sets Priority
        /// </summary>
        [DataMember(Name = "priority", EmitDefaultValue = true)]
        public bool Priority { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AuthenticationSendOtpRequest {\n");
            sb.Append("  Destination: ").Append(Destination).Append("\n");
            sb.Append("  Length: ").Append(Length).Append("\n");
            sb.Append("  Channel: ").Append(Channel).Append("\n");
            sb.Append("  SenderId: ").Append(SenderId).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AuthenticationSendOtpRequest);
        }

        /// <summary>
        /// Returns true if AuthenticationSendOtpRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of AuthenticationSendOtpRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AuthenticationSendOtpRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Destination == input.Destination ||
                    (this.Destination != null &&
                    this.Destination.Equals(input.Destination))
                ) && 
                (
                    this.Length == input.Length ||
                    this.Length.Equals(input.Length)
                ) && 
                (
                    this.Channel == input.Channel ||
                    (this.Channel != null &&
                    this.Channel.Equals(input.Channel))
                ) && 
                (
                    this.SenderId == input.SenderId ||
                    (this.SenderId != null &&
                    this.SenderId.Equals(input.SenderId))
                ) && 
                (
                    this.Priority == input.Priority ||
                    this.Priority.Equals(input.Priority)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Destination != null)
                {
                    hashCode = (hashCode * 59) + this.Destination.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Length.GetHashCode();
                if (this.Channel != null)
                {
                    hashCode = (hashCode * 59) + this.Channel.GetHashCode();
                }
                if (this.SenderId != null)
                {
                    hashCode = (hashCode * 59) + this.SenderId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Priority.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}