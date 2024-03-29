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
    /// KycSubmitAddressResponseEntity
    /// </summary>
    [DataContract(Name = "KycSubmitAddressResponse_entity")]
    public partial class KycSubmitAddressResponseEntity : IEquatable<KycSubmitAddressResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KycSubmitAddressResponseEntity" /> class.
        /// </summary>
        /// <param name="status">status.</param>
        /// <param name="referenceId">referenceId.</param>
        /// <param name="data">data.</param>
        public KycSubmitAddressResponseEntity(decimal status = default(decimal), string referenceId = default(string), KycSubmitAddressResponseEntityData data = default(KycSubmitAddressResponseEntityData))
        {
            this.Status = status;
            this.ReferenceId = referenceId;
            this.Data = data;
        }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public decimal Status { get; set; }

        /// <summary>
        /// Gets or Sets ReferenceId
        /// </summary>
        [DataMember(Name = "reference_id", EmitDefaultValue = false)]
        public string ReferenceId { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public KycSubmitAddressResponseEntityData Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class KycSubmitAddressResponseEntity {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  ReferenceId: ").Append(ReferenceId).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as KycSubmitAddressResponseEntity);
        }

        /// <summary>
        /// Returns true if KycSubmitAddressResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of KycSubmitAddressResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KycSubmitAddressResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.ReferenceId == input.ReferenceId ||
                    (this.ReferenceId != null &&
                    this.ReferenceId.Equals(input.ReferenceId))
                ) && 
                (
                    this.Data == input.Data ||
                    (this.Data != null &&
                    this.Data.Equals(input.Data))
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
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.ReferenceId != null)
                {
                    hashCode = (hashCode * 59) + this.ReferenceId.GetHashCode();
                }
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
