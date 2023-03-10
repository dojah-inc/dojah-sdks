/*
 * DOJAH APIs
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
    /// RequestSenderIdRequest
    /// </summary>
    [DataContract(Name = "RequestSenderIdRequest")]
    public partial class RequestSenderIdRequest : IEquatable<RequestSenderIdRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RequestSenderIdRequest" /> class.
        /// </summary>
        /// <param name="senderId">senderId.</param>
        public RequestSenderIdRequest(string senderId = default(string))
        {
            this.SenderId = senderId;
        }

        /// <summary>
        /// Gets or Sets SenderId
        /// </summary>
        [DataMember(Name = "sender_id", EmitDefaultValue = false)]
        public string SenderId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RequestSenderIdRequest {\n");
            sb.Append("  SenderId: ").Append(SenderId).Append("\n");
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
            return this.Equals(input as RequestSenderIdRequest);
        }

        /// <summary>
        /// Returns true if RequestSenderIdRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of RequestSenderIdRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestSenderIdRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SenderId == input.SenderId ||
                    (this.SenderId != null &&
                    this.SenderId.Equals(input.SenderId))
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
                if (this.SenderId != null)
                {
                    hashCode = (hashCode * 59) + this.SenderId.GetHashCode();
                }
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