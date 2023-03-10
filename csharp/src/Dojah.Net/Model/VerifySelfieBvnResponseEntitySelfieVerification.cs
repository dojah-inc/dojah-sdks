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
    /// VerifySelfieBvnResponseEntitySelfieVerification
    /// </summary>
    [DataContract(Name = "VerifySelfieBvnResponse_entity_selfie_verification")]
    public partial class VerifySelfieBvnResponseEntitySelfieVerification : IEquatable<VerifySelfieBvnResponseEntitySelfieVerification>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VerifySelfieBvnResponseEntitySelfieVerification" /> class.
        /// </summary>
        /// <param name="confidenceValue">confidenceValue.</param>
        /// <param name="match">match.</param>
        public VerifySelfieBvnResponseEntitySelfieVerification(decimal confidenceValue = default(decimal), bool match = default(bool))
        {
            this.ConfidenceValue = confidenceValue;
            this.Match = match;
        }

        /// <summary>
        /// Gets or Sets ConfidenceValue
        /// </summary>
        [DataMember(Name = "confidence_value", EmitDefaultValue = false)]
        public decimal ConfidenceValue { get; set; }

        /// <summary>
        /// Gets or Sets Match
        /// </summary>
        [DataMember(Name = "match", EmitDefaultValue = true)]
        public bool Match { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VerifySelfieBvnResponseEntitySelfieVerification {\n");
            sb.Append("  ConfidenceValue: ").Append(ConfidenceValue).Append("\n");
            sb.Append("  Match: ").Append(Match).Append("\n");
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
            return this.Equals(input as VerifySelfieBvnResponseEntitySelfieVerification);
        }

        /// <summary>
        /// Returns true if VerifySelfieBvnResponseEntitySelfieVerification instances are equal
        /// </summary>
        /// <param name="input">Instance of VerifySelfieBvnResponseEntitySelfieVerification to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VerifySelfieBvnResponseEntitySelfieVerification input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ConfidenceValue == input.ConfidenceValue ||
                    this.ConfidenceValue.Equals(input.ConfidenceValue)
                ) && 
                (
                    this.Match == input.Match ||
                    this.Match.Equals(input.Match)
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
                hashCode = (hashCode * 59) + this.ConfidenceValue.GetHashCode();
                hashCode = (hashCode * 59) + this.Match.GetHashCode();
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